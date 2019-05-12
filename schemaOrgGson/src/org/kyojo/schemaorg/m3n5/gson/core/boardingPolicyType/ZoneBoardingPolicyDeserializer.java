package org.kyojo.schemaorg.m3n5.gson.core.boardingPolicyType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.boardingPolicyType.ZONE_BOARDING_POLICY;
import org.kyojo.schemaorg.m3n5.core.BoardingPolicyType.ZoneBoardingPolicy;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ZoneBoardingPolicyDeserializer implements JsonDeserializer<ZoneBoardingPolicy> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ZoneBoardingPolicy deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ZONE_BOARDING_POLICY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ZONE_BOARDING_POLICY(), ZoneBoardingPolicy.class, ZONE_BOARDING_POLICY.class, fldMap);
	}

}
