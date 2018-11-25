package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.NUMBER_OF_PREVIOUS_OWNERS;
import org.kyojo.schemaorg.m3n4.core.Container.NumberOfPreviousOwners;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class NumberOfPreviousOwnersDeserializer implements JsonDeserializer<NumberOfPreviousOwners> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public NumberOfPreviousOwners deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new NUMBER_OF_PREVIOUS_OWNERS(jsonElement.getAsBigDecimal());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new NUMBER_OF_PREVIOUS_OWNERS(), NumberOfPreviousOwners.class, NUMBER_OF_PREVIOUS_OWNERS.class, fldMap);
	}

}
