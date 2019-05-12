package org.kyojo.schemaorg.m3n5.gson.core.boardingPolicyType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.boardingPolicyType.GROUP_BOARDING_POLICY;
import org.kyojo.schemaorg.m3n5.core.BoardingPolicyType.GroupBoardingPolicy;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class GroupBoardingPolicyDeserializer implements JsonDeserializer<GroupBoardingPolicy> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public GroupBoardingPolicy deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new GROUP_BOARDING_POLICY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new GROUP_BOARDING_POLICY(), GroupBoardingPolicy.class, GROUP_BOARDING_POLICY.class, fldMap);
	}

}
