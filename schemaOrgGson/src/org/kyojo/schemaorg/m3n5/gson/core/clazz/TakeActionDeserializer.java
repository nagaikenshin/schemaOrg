package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.TAKE_ACTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.TakeAction;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class TakeActionDeserializer implements JsonDeserializer<TakeAction> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public TakeAction deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new TAKE_ACTION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new TAKE_ACTION(), TakeAction.class, TAKE_ACTION.class, fldMap);
	}

}
