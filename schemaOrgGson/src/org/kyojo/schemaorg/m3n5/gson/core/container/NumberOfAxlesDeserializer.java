package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.NUMBER_OF_AXLES;
import org.kyojo.schemaorg.m3n5.core.Container.NumberOfAxles;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class NumberOfAxlesDeserializer implements JsonDeserializer<NumberOfAxles> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public NumberOfAxles deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new NUMBER_OF_AXLES(jsonElement.getAsBigDecimal());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new NUMBER_OF_AXLES(), NumberOfAxles.class, NUMBER_OF_AXLES.class, fldMap);
	}

}
