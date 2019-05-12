package org.kyojo.schemaorg.m3n5.gson.auto.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.auto.impl.SPEED;
import org.kyojo.schemaorg.m3n5.auto.Container.Speed;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class SpeedDeserializer implements JsonDeserializer<Speed> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Speed deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SPEED(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SPEED(), Speed.class, SPEED.class, fldMap);
	}

}
