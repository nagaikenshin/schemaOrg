package org.kyojo.schemaorg.m3n4.gson.pending.legalForceStatus;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.legalForceStatus.IN_FORCE;
import org.kyojo.schemaorg.m3n4.pending.LegalForceStatus.InForce;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class InForceDeserializer implements JsonDeserializer<InForce> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public InForce deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new IN_FORCE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new IN_FORCE(), InForce.class, IN_FORCE.class, fldMap);
	}

}
