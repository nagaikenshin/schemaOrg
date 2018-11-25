package org.kyojo.schemaorg.m3n4.gson.auto.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.auto.impl.MOTORIZED_BICYCLE;
import org.kyojo.schemaorg.m3n4.auto.Clazz.MotorizedBicycle;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class MotorizedBicycleDeserializer implements JsonDeserializer<MotorizedBicycle> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MotorizedBicycle deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MOTORIZED_BICYCLE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MOTORIZED_BICYCLE(), MotorizedBicycle.class, MOTORIZED_BICYCLE.class, fldMap);
	}

}
