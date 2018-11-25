package org.kyojo.schemaorg.m3n4.gson.auto.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.auto.impl.TORQUE;
import org.kyojo.schemaorg.m3n4.auto.Container.Torque;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class TorqueDeserializer implements JsonDeserializer<Torque> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Torque deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new TORQUE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new TORQUE(), Torque.class, TORQUE.class, fldMap);
	}

}
