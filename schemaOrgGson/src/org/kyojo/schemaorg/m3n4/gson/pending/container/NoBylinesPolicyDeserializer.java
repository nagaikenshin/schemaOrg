package org.kyojo.schemaorg.m3n4.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.NO_BYLINES_POLICY;
import org.kyojo.schemaorg.m3n4.pending.Container.NoBylinesPolicy;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class NoBylinesPolicyDeserializer implements JsonDeserializer<NoBylinesPolicy> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public NoBylinesPolicy deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new NO_BYLINES_POLICY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new NO_BYLINES_POLICY(), NoBylinesPolicy.class, NO_BYLINES_POLICY.class, fldMap);
	}

}
