package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.SERVICE_URL;
import org.kyojo.schemaorg.m3n4.core.Container.ServiceUrl;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ServiceUrlDeserializer implements JsonDeserializer<ServiceUrl> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ServiceUrl deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SERVICE_URL(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SERVICE_URL(), ServiceUrl.class, SERVICE_URL.class, fldMap);
	}

}
