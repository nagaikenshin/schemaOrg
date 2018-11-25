package org.kyojo.schemaorg.m3n4.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.EXPERT_CONSIDERATIONS;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.ExpertConsiderations;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ExpertConsiderationsDeserializer implements JsonDeserializer<ExpertConsiderations> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ExpertConsiderations deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new EXPERT_CONSIDERATIONS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new EXPERT_CONSIDERATIONS(), ExpertConsiderations.class, EXPERT_CONSIDERATIONS.class, fldMap);
	}

}
