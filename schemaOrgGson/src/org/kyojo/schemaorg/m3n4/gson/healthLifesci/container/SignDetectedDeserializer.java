package org.kyojo.schemaorg.m3n4.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.SIGN_DETECTED;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.SignDetected;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class SignDetectedDeserializer implements JsonDeserializer<SignDetected> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SignDetected deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SIGN_DETECTED(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SIGN_DETECTED(), SignDetected.class, SIGN_DETECTED.class, fldMap);
	}

}
