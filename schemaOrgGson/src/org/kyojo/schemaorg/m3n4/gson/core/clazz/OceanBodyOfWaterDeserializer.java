package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.OCEAN_BODY_OF_WATER;
import org.kyojo.schemaorg.m3n4.core.Clazz.OceanBodyOfWater;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class OceanBodyOfWaterDeserializer implements JsonDeserializer<OceanBodyOfWater> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public OceanBodyOfWater deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new OCEAN_BODY_OF_WATER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new OCEAN_BODY_OF_WATER(), OceanBodyOfWater.class, OCEAN_BODY_OF_WATER.class, fldMap);
	}

}
