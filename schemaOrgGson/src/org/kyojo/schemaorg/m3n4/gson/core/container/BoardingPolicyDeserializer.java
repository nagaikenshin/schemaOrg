package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.BOARDING_POLICY;
import org.kyojo.schemaorg.m3n4.core.Container.BoardingPolicy;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class BoardingPolicyDeserializer implements JsonDeserializer<BoardingPolicy> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public BoardingPolicy deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new BOARDING_POLICY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new BOARDING_POLICY(), BoardingPolicy.class, BOARDING_POLICY.class, fldMap);
	}

}
