package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.CONTROL_ACTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.ControlAction;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ControlActionDeserializer implements JsonDeserializer<ControlAction> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ControlAction deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CONTROL_ACTION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CONTROL_ACTION(), ControlAction.class, CONTROL_ACTION.class, fldMap);
	}

}
