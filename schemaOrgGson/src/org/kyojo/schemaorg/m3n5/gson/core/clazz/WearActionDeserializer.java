package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.WEAR_ACTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.WearAction;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class WearActionDeserializer implements JsonDeserializer<WearAction> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public WearAction deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new WEAR_ACTION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new WEAR_ACTION(), WearAction.class, WEAR_ACTION.class, fldMap);
	}

}
