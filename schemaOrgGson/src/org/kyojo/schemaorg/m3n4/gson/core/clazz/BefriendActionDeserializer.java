package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.BEFRIEND_ACTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.BefriendAction;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class BefriendActionDeserializer implements JsonDeserializer<BefriendAction> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public BefriendAction deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new BEFRIEND_ACTION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new BEFRIEND_ACTION(), BefriendAction.class, BEFRIEND_ACTION.class, fldMap);
	}

}
