package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.WATCH_ACTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.WatchAction;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class WatchActionDeserializer implements JsonDeserializer<WatchAction> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public WatchAction deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new WATCH_ACTION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new WATCH_ACTION(), WatchAction.class, WATCH_ACTION.class, fldMap);
	}

}
