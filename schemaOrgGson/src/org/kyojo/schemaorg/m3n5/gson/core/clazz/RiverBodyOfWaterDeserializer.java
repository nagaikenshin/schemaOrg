package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.RIVER_BODY_OF_WATER;
import org.kyojo.schemaorg.m3n5.core.Clazz.RiverBodyOfWater;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class RiverBodyOfWaterDeserializer implements JsonDeserializer<RiverBodyOfWater> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public RiverBodyOfWater deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new RIVER_BODY_OF_WATER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new RIVER_BODY_OF_WATER(), RiverBodyOfWater.class, RIVER_BODY_OF_WATER.class, fldMap);
	}

}