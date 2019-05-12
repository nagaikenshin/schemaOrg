package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.LANDMARKS_OR_HISTORICAL_BUILDINGS;
import org.kyojo.schemaorg.m3n5.core.Clazz.LandmarksOrHistoricalBuildings;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class LandmarksOrHistoricalBuildingsDeserializer implements JsonDeserializer<LandmarksOrHistoricalBuildings> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public LandmarksOrHistoricalBuildings deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new LANDMARKS_OR_HISTORICAL_BUILDINGS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new LANDMARKS_OR_HISTORICAL_BUILDINGS(), LandmarksOrHistoricalBuildings.class, LANDMARKS_OR_HISTORICAL_BUILDINGS.class, fldMap);
	}

}
