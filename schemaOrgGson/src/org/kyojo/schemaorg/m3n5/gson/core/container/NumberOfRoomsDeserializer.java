package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.NUMBER_OF_ROOMS;
import org.kyojo.schemaorg.m3n5.core.Container.NumberOfRooms;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class NumberOfRoomsDeserializer implements JsonDeserializer<NumberOfRooms> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public NumberOfRooms deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new NUMBER_OF_ROOMS(jsonElement.getAsBigDecimal());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new NUMBER_OF_ROOMS(), NumberOfRooms.class, NUMBER_OF_ROOMS.class, fldMap);
	}

}
