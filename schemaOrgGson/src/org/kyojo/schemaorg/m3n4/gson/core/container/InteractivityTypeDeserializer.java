package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.INTERACTIVITY_TYPE;
import org.kyojo.schemaorg.m3n4.core.Container.InteractivityType;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class InteractivityTypeDeserializer implements JsonDeserializer<InteractivityType> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public InteractivityType deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new INTERACTIVITY_TYPE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new INTERACTIVITY_TYPE(), InteractivityType.class, INTERACTIVITY_TYPE.class, fldMap);
	}

}
