package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.BODY_OF_WATER;
import org.kyojo.schemaorg.m3n4.core.Clazz.BodyOfWater;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class BodyOfWaterDeserializer implements JsonDeserializer<BodyOfWater> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public BodyOfWater deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new BODY_OF_WATER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new BODY_OF_WATER(), BodyOfWater.class, BODY_OF_WATER.class, fldMap);
	}

}
