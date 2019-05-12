package org.kyojo.schemaorg.m3n5.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.ACTIVITY_DURATION;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.ActivityDuration;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ActivityDurationDeserializer implements JsonDeserializer<ActivityDuration> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ActivityDuration deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ACTIVITY_DURATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ACTIVITY_DURATION(), ActivityDuration.class, ACTIVITY_DURATION.class, fldMap);
	}

}
