package org.kyojo.schemaorg.m3n5.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.BENEFITS_SUMMARY_URL;
import org.kyojo.schemaorg.m3n5.pending.Container.BenefitsSummaryUrl;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class BenefitsSummaryUrlDeserializer implements JsonDeserializer<BenefitsSummaryUrl> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public BenefitsSummaryUrl deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new BENEFITS_SUMMARY_URL(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new BENEFITS_SUMMARY_URL(), BenefitsSummaryUrl.class, BENEFITS_SUMMARY_URL.class, fldMap);
	}

}
