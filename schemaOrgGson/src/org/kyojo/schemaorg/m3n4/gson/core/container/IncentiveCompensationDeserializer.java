package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.INCENTIVE_COMPENSATION;
import org.kyojo.schemaorg.m3n4.core.Container.IncentiveCompensation;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class IncentiveCompensationDeserializer implements JsonDeserializer<IncentiveCompensation> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public IncentiveCompensation deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new INCENTIVE_COMPENSATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new INCENTIVE_COMPENSATION(), IncentiveCompensation.class, INCENTIVE_COMPENSATION.class, fldMap);
	}

}
