package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.NUMBER_OF_FORWARD_GEARS;
import org.kyojo.schemaorg.m3n4.core.Container.NumberOfForwardGears;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class NumberOfForwardGearsDeserializer implements JsonDeserializer<NumberOfForwardGears> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public NumberOfForwardGears deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new NUMBER_OF_FORWARD_GEARS(jsonElement.getAsBigDecimal());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new NUMBER_OF_FORWARD_GEARS(), NumberOfForwardGears.class, NUMBER_OF_FORWARD_GEARS.class, fldMap);
	}

}
