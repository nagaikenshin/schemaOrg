package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.DISLIKE_ACTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.DislikeAction;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class DislikeActionDeserializer implements JsonDeserializer<DislikeAction> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DislikeAction deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DISLIKE_ACTION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DISLIKE_ACTION(), DislikeAction.class, DISLIKE_ACTION.class, fldMap);
	}

}