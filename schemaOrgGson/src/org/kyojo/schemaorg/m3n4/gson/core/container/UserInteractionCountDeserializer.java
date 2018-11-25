package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.USER_INTERACTION_COUNT;
import org.kyojo.schemaorg.m3n4.core.Container.UserInteractionCount;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class UserInteractionCountDeserializer implements JsonDeserializer<UserInteractionCount> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public UserInteractionCount deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			try {
				return new USER_INTERACTION_COUNT(jsonElement.getAsLong());
			} catch(NumberFormatException nfe) {
				return null;
			}
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new USER_INTERACTION_COUNT(), UserInteractionCount.class, USER_INTERACTION_COUNT.class, fldMap);
	}

}
