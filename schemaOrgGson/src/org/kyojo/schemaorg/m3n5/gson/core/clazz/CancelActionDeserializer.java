package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.CANCEL_ACTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.CancelAction;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class CancelActionDeserializer implements JsonDeserializer<CancelAction> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CancelAction deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CANCEL_ACTION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CANCEL_ACTION(), CancelAction.class, CANCEL_ACTION.class, fldMap);
	}

}
