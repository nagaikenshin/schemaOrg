package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.NUMBER_OF_BEDS;
import org.kyojo.schemaorg.m3n4.core.Container.NumberOfBeds;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class NumberOfBedsDeserializer implements JsonDeserializer<NumberOfBeds> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public NumberOfBeds deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new NUMBER_OF_BEDS(jsonElement.getAsBigDecimal());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new NUMBER_OF_BEDS(), NumberOfBeds.class, NUMBER_OF_BEDS.class, fldMap);
	}

}
