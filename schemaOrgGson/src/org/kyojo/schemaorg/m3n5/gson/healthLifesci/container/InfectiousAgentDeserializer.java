package org.kyojo.schemaorg.m3n5.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.INFECTIOUS_AGENT;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.InfectiousAgent;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class InfectiousAgentDeserializer implements JsonDeserializer<InfectiousAgent> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public InfectiousAgent deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new INFECTIOUS_AGENT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new INFECTIOUS_AGENT(), InfectiousAgent.class, INFECTIOUS_AGENT.class, fldMap);
	}

}
