package org.kyojo.schemaorg.m3n5.gson.core.actionStatusType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.actionStatusType.ACTIVE_ACTION_STATUS;
import org.kyojo.schemaorg.m3n5.core.ActionStatusType.ActiveActionStatus;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ActiveActionStatusDeserializer implements JsonDeserializer<ActiveActionStatus> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ActiveActionStatus deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ACTIVE_ACTION_STATUS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ACTIVE_ACTION_STATUS(), ActiveActionStatus.class, ACTIVE_ACTION_STATUS.class, fldMap);
	}

}
