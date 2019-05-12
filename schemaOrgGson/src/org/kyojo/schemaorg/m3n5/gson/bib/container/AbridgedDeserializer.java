package org.kyojo.schemaorg.m3n5.gson.bib.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.bib.impl.ABRIDGED;
import org.kyojo.schemaorg.m3n5.bib.Container.Abridged;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class AbridgedDeserializer implements JsonDeserializer<Abridged> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Abridged deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ABRIDGED(jsonElement.getAsBoolean());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ABRIDGED(), Abridged.class, ABRIDGED.class, fldMap);
	}

}
