package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.SERVICE_PHONE;
import org.kyojo.schemaorg.m3n5.core.Container.ServicePhone;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ServicePhoneDeserializer implements JsonDeserializer<ServicePhone> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ServicePhone deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SERVICE_PHONE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SERVICE_PHONE(), ServicePhone.class, SERVICE_PHONE.class, fldMap);
	}

}
