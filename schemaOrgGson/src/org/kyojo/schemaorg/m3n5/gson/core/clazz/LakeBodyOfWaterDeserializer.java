package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.LAKE_BODY_OF_WATER;
import org.kyojo.schemaorg.m3n5.core.Clazz.LakeBodyOfWater;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class LakeBodyOfWaterDeserializer implements JsonDeserializer<LakeBodyOfWater> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public LakeBodyOfWater deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new LAKE_BODY_OF_WATER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new LAKE_BODY_OF_WATER(), LakeBodyOfWater.class, LAKE_BODY_OF_WATER.class, fldMap);
	}

}
