package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.UPDATE_ACTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.UpdateAction;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class UpdateActionDeserializer implements JsonDeserializer<UpdateAction> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public UpdateAction deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new UPDATE_ACTION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new UPDATE_ACTION(), UpdateAction.class, UPDATE_ACTION.class, fldMap);
	}

}