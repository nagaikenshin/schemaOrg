package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.EMERGENCY_SERVICE;
import org.kyojo.schemaorg.m3n5.core.Clazz.EmergencyService;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class EmergencyServiceDeserializer implements JsonDeserializer<EmergencyService> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public EmergencyService deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new EMERGENCY_SERVICE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new EMERGENCY_SERVICE(), EmergencyService.class, EMERGENCY_SERVICE.class, fldMap);
	}

}
