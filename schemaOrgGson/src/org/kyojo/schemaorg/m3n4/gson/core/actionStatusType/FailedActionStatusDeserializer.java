package org.kyojo.schemaorg.m3n4.gson.core.actionStatusType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.actionStatusType.FAILED_ACTION_STATUS;
import org.kyojo.schemaorg.m3n4.core.ActionStatusType.FailedActionStatus;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class FailedActionStatusDeserializer implements JsonDeserializer<FailedActionStatus> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public FailedActionStatus deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new FAILED_ACTION_STATUS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new FAILED_ACTION_STATUS(), FailedActionStatus.class, FAILED_ACTION_STATUS.class, fldMap);
	}

}
