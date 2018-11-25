package org.kyojo.schemaorg.m3n4.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.EARLY_PREPAYMENT_PENALTY;
import org.kyojo.schemaorg.m3n4.pending.Container.EarlyPrepaymentPenalty;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class EarlyPrepaymentPenaltyDeserializer implements JsonDeserializer<EarlyPrepaymentPenalty> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public EarlyPrepaymentPenalty deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new EARLY_PREPAYMENT_PENALTY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new EARLY_PREPAYMENT_PENALTY(), EarlyPrepaymentPenalty.class, EARLY_PREPAYMENT_PENALTY.class, fldMap);
	}

}
