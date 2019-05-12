package org.kyojo.schemaorg.m3n5.gson.bib.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.bib.impl.IN_SUPPORT_OF;
import org.kyojo.schemaorg.m3n5.bib.Container.InSupportOf;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class InSupportOfDeserializer implements JsonDeserializer<InSupportOf> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public InSupportOf deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new IN_SUPPORT_OF(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new IN_SUPPORT_OF(), InSupportOf.class, IN_SUPPORT_OF.class, fldMap);
	}

}
