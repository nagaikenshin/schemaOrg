package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.CONFIRM_ACTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.ConfirmAction;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ConfirmActionDeserializer implements JsonDeserializer<ConfirmAction> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ConfirmAction deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CONFIRM_ACTION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CONFIRM_ACTION(), ConfirmAction.class, CONFIRM_ACTION.class, fldMap);
	}

}
