package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.CREATE_ACTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.CreateAction;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class CreateActionDeserializer implements JsonDeserializer<CreateAction> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CreateAction deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CREATE_ACTION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CREATE_ACTION(), CreateAction.class, CREATE_ACTION.class, fldMap);
	}

}