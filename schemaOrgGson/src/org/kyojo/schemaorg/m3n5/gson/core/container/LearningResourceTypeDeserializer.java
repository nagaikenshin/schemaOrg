package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.LEARNING_RESOURCE_TYPE;
import org.kyojo.schemaorg.m3n5.core.Container.LearningResourceType;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class LearningResourceTypeDeserializer implements JsonDeserializer<LearningResourceType> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public LearningResourceType deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new LEARNING_RESOURCE_TYPE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new LEARNING_RESOURCE_TYPE(), LearningResourceType.class, LEARNING_RESOURCE_TYPE.class, fldMap);
	}

}
