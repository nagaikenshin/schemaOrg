package org.kyojo.schemaorg.m3n4.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.OWNERSHIP_FUNDING_INFO;
import org.kyojo.schemaorg.m3n4.pending.Container.OwnershipFundingInfo;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class OwnershipFundingInfoDeserializer implements JsonDeserializer<OwnershipFundingInfo> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public OwnershipFundingInfo deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new OWNERSHIP_FUNDING_INFO(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new OWNERSHIP_FUNDING_INFO(), OwnershipFundingInfo.class, OWNERSHIP_FUNDING_INFO.class, fldMap);
	}

}
