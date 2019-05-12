package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.SMOKING_ALLOWED;
import org.kyojo.schemaorg.m3n5.core.Container.SmokingAllowed;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class SmokingAllowedDeserializer implements JsonDeserializer<SmokingAllowed> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SmokingAllowed deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SMOKING_ALLOWED(jsonElement.getAsBoolean());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SMOKING_ALLOWED(), SmokingAllowed.class, SMOKING_ALLOWED.class, fldMap);
	}

}
