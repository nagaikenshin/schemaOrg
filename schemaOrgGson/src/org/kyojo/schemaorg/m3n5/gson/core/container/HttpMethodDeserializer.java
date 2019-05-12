package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.HTTP_METHOD;
import org.kyojo.schemaorg.m3n5.core.Container.HttpMethod;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class HttpMethodDeserializer implements JsonDeserializer<HttpMethod> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public HttpMethod deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new HTTP_METHOD(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new HTTP_METHOD(), HttpMethod.class, HTTP_METHOD.class, fldMap);
	}

}
