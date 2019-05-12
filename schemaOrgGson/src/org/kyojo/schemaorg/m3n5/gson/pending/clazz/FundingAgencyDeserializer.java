package org.kyojo.schemaorg.m3n5.gson.pending.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.FUNDING_AGENCY;
import org.kyojo.schemaorg.m3n5.pending.Clazz.FundingAgency;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class FundingAgencyDeserializer implements JsonDeserializer<FundingAgency> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public FundingAgency deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new FUNDING_AGENCY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new FUNDING_AGENCY(), FundingAgency.class, FUNDING_AGENCY.class, fldMap);
	}

}
