package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.REAL_ESTATE_AGENT;
import org.kyojo.schemaorg.m3n5.core.Clazz.RealEstateAgent;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class RealEstateAgentDeserializer implements JsonDeserializer<RealEstateAgent> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public RealEstateAgent deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new REAL_ESTATE_AGENT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new REAL_ESTATE_AGENT(), RealEstateAgent.class, REAL_ESTATE_AGENT.class, fldMap);
	}

}
