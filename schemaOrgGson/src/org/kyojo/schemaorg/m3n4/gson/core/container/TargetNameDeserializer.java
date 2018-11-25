package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.TARGET_NAME;
import org.kyojo.schemaorg.m3n4.core.Container.TargetName;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class TargetNameDeserializer implements JsonDeserializer<TargetName> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public TargetName deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new TARGET_NAME(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new TARGET_NAME(), TargetName.class, TARGET_NAME.class, fldMap);
	}

}
