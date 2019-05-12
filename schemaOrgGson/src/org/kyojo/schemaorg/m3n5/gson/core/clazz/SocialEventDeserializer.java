package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.SOCIAL_EVENT;
import org.kyojo.schemaorg.m3n5.core.Clazz.SocialEvent;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class SocialEventDeserializer implements JsonDeserializer<SocialEvent> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SocialEvent deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SOCIAL_EVENT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SOCIAL_EVENT(), SocialEvent.class, SOCIAL_EVENT.class, fldMap);
	}

}
