package org.kyojo.schemaorg.m3n4.gson.core.steeringPositionValue;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.steeringPositionValue.LEFT_HAND_DRIVING;
import org.kyojo.schemaorg.m3n4.core.SteeringPositionValue.LeftHandDriving;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class LeftHandDrivingDeserializer implements JsonDeserializer<LeftHandDriving> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public LeftHandDriving deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new LEFT_HAND_DRIVING(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new LEFT_HAND_DRIVING(), LeftHandDriving.class, LEFT_HAND_DRIVING.class, fldMap);
	}

}
