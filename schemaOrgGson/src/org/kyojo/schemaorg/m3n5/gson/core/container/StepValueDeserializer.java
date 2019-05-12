package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.STEP_VALUE;
import org.kyojo.schemaorg.m3n5.core.Container.StepValue;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class StepValueDeserializer implements JsonDeserializer<StepValue> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public StepValue deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new STEP_VALUE(jsonElement.getAsBigDecimal());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new STEP_VALUE(), StepValue.class, STEP_VALUE.class, fldMap);
	}

}
