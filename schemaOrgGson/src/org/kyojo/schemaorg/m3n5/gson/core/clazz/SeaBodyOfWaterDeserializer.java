package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.SEA_BODY_OF_WATER;
import org.kyojo.schemaorg.m3n5.core.Clazz.SeaBodyOfWater;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class SeaBodyOfWaterDeserializer implements JsonDeserializer<SeaBodyOfWater> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SeaBodyOfWater deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SEA_BODY_OF_WATER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SEA_BODY_OF_WATER(), SeaBodyOfWater.class, SEA_BODY_OF_WATER.class, fldMap);
	}

}
