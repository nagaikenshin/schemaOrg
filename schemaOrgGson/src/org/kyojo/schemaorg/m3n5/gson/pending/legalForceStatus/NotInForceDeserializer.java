package org.kyojo.schemaorg.m3n5.gson.pending.legalForceStatus;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.legalForceStatus.NOT_IN_FORCE;
import org.kyojo.schemaorg.m3n5.pending.LegalForceStatus.NotInForce;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class NotInForceDeserializer implements JsonDeserializer<NotInForce> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public NotInForce deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new NOT_IN_FORCE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new NOT_IN_FORCE(), NotInForce.class, NOT_IN_FORCE.class, fldMap);
	}

}
