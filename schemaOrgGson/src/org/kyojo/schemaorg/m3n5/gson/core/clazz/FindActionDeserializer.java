package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.FIND_ACTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.FindAction;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class FindActionDeserializer implements JsonDeserializer<FindAction> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public FindAction deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new FIND_ACTION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new FIND_ACTION(), FindAction.class, FIND_ACTION.class, fldMap);
	}

}
