package org.kyojo.schemaorg.m3n4.gson.core.steeringPositionValue;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.steeringPositionValue.RIGHT_HAND_DRIVING;
import org.kyojo.schemaorg.m3n4.core.SteeringPositionValue.RightHandDriving;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class RightHandDrivingDeserializer implements JsonDeserializer<RightHandDriving> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public RightHandDriving deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new RIGHT_HAND_DRIVING(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new RIGHT_HAND_DRIVING(), RightHandDriving.class, RIGHT_HAND_DRIVING.class, fldMap);
	}

}
