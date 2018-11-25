package org.kyojo.schemaorg.m3n4.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.INFECTIOUS_AGENT_CLASS;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.InfectiousAgentClass;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class InfectiousAgentClassDeserializer implements JsonDeserializer<InfectiousAgentClass> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public InfectiousAgentClass deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new INFECTIOUS_AGENT_CLASS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new INFECTIOUS_AGENT_CLASS(), InfectiousAgentClass.class, INFECTIOUS_AGENT_CLASS.class, fldMap);
	}

}
