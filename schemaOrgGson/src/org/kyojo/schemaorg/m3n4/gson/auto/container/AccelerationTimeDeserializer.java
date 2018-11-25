package org.kyojo.schemaorg.m3n4.gson.auto.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.auto.impl.ACCELERATION_TIME;
import org.kyojo.schemaorg.m3n4.auto.Container.AccelerationTime;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class AccelerationTimeDeserializer implements JsonDeserializer<AccelerationTime> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AccelerationTime deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ACCELERATION_TIME(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ACCELERATION_TIME(), AccelerationTime.class, ACCELERATION_TIME.class, fldMap);
	}

}
