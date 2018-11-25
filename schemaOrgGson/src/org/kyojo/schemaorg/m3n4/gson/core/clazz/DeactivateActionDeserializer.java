package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.DEACTIVATE_ACTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.DeactivateAction;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class DeactivateActionDeserializer implements JsonDeserializer<DeactivateAction> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DeactivateAction deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DEACTIVATE_ACTION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DEACTIVATE_ACTION(), DeactivateAction.class, DEACTIVATE_ACTION.class, fldMap);
	}

}
