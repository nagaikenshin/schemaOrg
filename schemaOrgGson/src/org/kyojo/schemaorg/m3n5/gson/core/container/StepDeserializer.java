package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.STEP;
import org.kyojo.schemaorg.m3n5.core.Container.Step;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class StepDeserializer implements JsonDeserializer<Step> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Step deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new STEP(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new STEP(), Step.class, STEP.class, fldMap);
	}

}
