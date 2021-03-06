package org.kyojo.schemaorg.m3n5.gson.bib.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.bib.impl.INKER;
import org.kyojo.schemaorg.m3n5.bib.Container.Inker;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class InkerDeserializer implements JsonDeserializer<Inker> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Inker deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new INKER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new INKER(), Inker.class, INKER.class, fldMap);
	}

}
