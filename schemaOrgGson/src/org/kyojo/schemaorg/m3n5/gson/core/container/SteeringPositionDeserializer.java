package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.STEERING_POSITION;
import org.kyojo.schemaorg.m3n5.core.Container.SteeringPosition;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class SteeringPositionDeserializer implements JsonDeserializer<SteeringPosition> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SteeringPosition deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new STEERING_POSITION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new STEERING_POSITION(), SteeringPosition.class, STEERING_POSITION.class, fldMap);
	}

}
