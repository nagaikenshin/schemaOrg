package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.RV_PARK;
import org.kyojo.schemaorg.m3n5.core.Clazz.RVPark;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class RVParkDeserializer implements JsonDeserializer<RVPark> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public RVPark deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new RV_PARK(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new RV_PARK(), RVPark.class, RV_PARK.class, fldMap);
	}

}
