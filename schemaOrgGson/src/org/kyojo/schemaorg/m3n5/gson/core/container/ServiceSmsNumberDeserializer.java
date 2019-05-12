package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.SERVICE_SMS_NUMBER;
import org.kyojo.schemaorg.m3n5.core.Container.ServiceSmsNumber;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ServiceSmsNumberDeserializer implements JsonDeserializer<ServiceSmsNumber> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ServiceSmsNumber deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SERVICE_SMS_NUMBER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SERVICE_SMS_NUMBER(), ServiceSmsNumber.class, SERVICE_SMS_NUMBER.class, fldMap);
	}

}
