package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.ACTION_STATUS;
import org.kyojo.schemaorg.m3n4.core.Container.ActionStatus;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ActionStatusDeserializer implements JsonDeserializer<ActionStatus> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ActionStatus deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ACTION_STATUS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ACTION_STATUS(), ActionStatus.class, ACTION_STATUS.class, fldMap);
	}

}
