package org.kyojo.schemaorg.m3n4.gson.bib.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.bib.impl.LETTERER;
import org.kyojo.schemaorg.m3n4.bib.Container.Letterer;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class LettererDeserializer implements JsonDeserializer<Letterer> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Letterer deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new LETTERER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new LETTERER(), Letterer.class, LETTERER.class, fldMap);
	}

}
