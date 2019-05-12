package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.TARGET_URL;
import org.kyojo.schemaorg.m3n5.core.Container.TargetUrl;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class TargetUrlDeserializer implements JsonDeserializer<TargetUrl> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public TargetUrl deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new TARGET_URL(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new TARGET_URL(), TargetUrl.class, TARGET_URL.class, fldMap);
	}

}
