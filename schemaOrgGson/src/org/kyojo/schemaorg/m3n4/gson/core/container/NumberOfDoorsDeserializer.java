package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.NUMBER_OF_DOORS;
import org.kyojo.schemaorg.m3n4.core.Container.NumberOfDoors;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class NumberOfDoorsDeserializer implements JsonDeserializer<NumberOfDoors> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public NumberOfDoors deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new NUMBER_OF_DOORS(jsonElement.getAsBigDecimal());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new NUMBER_OF_DOORS(), NumberOfDoors.class, NUMBER_OF_DOORS.class, fldMap);
	}

}
