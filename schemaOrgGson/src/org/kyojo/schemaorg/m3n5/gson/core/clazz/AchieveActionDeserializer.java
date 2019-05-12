package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.ACHIEVE_ACTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.AchieveAction;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class AchieveActionDeserializer implements JsonDeserializer<AchieveAction> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AchieveAction deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ACHIEVE_ACTION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ACHIEVE_ACTION(), AchieveAction.class, ACHIEVE_ACTION.class, fldMap);
	}

}
