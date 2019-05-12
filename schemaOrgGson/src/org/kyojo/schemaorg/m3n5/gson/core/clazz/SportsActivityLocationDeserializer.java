package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.SPORTS_ACTIVITY_LOCATION;
import org.kyojo.schemaorg.m3n5.core.Clazz.SportsActivityLocation;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class SportsActivityLocationDeserializer implements JsonDeserializer<SportsActivityLocation> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SportsActivityLocation deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SPORTS_ACTIVITY_LOCATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SPORTS_ACTIVITY_LOCATION(), SportsActivityLocation.class, SPORTS_ACTIVITY_LOCATION.class, fldMap);
	}

}
