package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.LEND_ACTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.LendAction;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class LendActionDeserializer implements JsonDeserializer<LendAction> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public LendAction deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new LEND_ACTION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new LEND_ACTION(), LendAction.class, LEND_ACTION.class, fldMap);
	}

}
