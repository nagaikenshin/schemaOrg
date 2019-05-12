package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.SERVICE_TYPE;
import org.kyojo.schemaorg.m3n5.core.Container.ServiceType;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ServiceTypeDeserializer implements JsonDeserializer<ServiceType> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ServiceType deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SERVICE_TYPE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SERVICE_TYPE(), ServiceType.class, SERVICE_TYPE.class, fldMap);
	}

}
