package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.SUBSCRIBE_ACTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.SubscribeAction;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class SubscribeActionDeserializer implements JsonDeserializer<SubscribeAction> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SubscribeAction deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SUBSCRIBE_ACTION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SUBSCRIBE_ACTION(), SubscribeAction.class, SUBSCRIBE_ACTION.class, fldMap);
	}

}
