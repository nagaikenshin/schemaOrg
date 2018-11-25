package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.ACTIVATE_ACTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.ActivateAction;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ActivateActionDeserializer implements JsonDeserializer<ActivateAction> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ActivateAction deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ACTIVATE_ACTION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ACTIVATE_ACTION(), ActivateAction.class, ACTIVATE_ACTION.class, fldMap);
	}

}
