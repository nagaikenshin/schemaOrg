package org.kyojo.schemaorg.m3n5.gson.core.actionStatusType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.actionStatusType.POTENTIAL_ACTION_STATUS;
import org.kyojo.schemaorg.m3n5.core.ActionStatusType.PotentialActionStatus;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class PotentialActionStatusDeserializer implements JsonDeserializer<PotentialActionStatus> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PotentialActionStatus deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new POTENTIAL_ACTION_STATUS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new POTENTIAL_ACTION_STATUS(), PotentialActionStatus.class, POTENTIAL_ACTION_STATUS.class, fldMap);
	}

}
