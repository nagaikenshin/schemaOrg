package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.ADD_ACTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.AddAction;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class AddActionDeserializer implements JsonDeserializer<AddAction> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AddAction deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ADD_ACTION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ADD_ACTION(), AddAction.class, ADD_ACTION.class, fldMap);
	}

}
