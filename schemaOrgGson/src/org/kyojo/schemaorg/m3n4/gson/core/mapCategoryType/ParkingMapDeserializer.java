package org.kyojo.schemaorg.m3n4.gson.core.mapCategoryType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.mapCategoryType.PARKING_MAP;
import org.kyojo.schemaorg.m3n4.core.MapCategoryType.ParkingMap;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ParkingMapDeserializer implements JsonDeserializer<ParkingMap> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ParkingMap deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PARKING_MAP(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PARKING_MAP(), ParkingMap.class, PARKING_MAP.class, fldMap);
	}

}
