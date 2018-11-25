package org.kyojo.schemaorg.m3n4.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.VARIABLE_MEASURED;
import org.kyojo.schemaorg.m3n4.pending.Container.VariableMeasured;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class VariableMeasuredDeserializer implements JsonDeserializer<VariableMeasured> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public VariableMeasured deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new VARIABLE_MEASURED(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new VARIABLE_MEASURED(), VariableMeasured.class, VARIABLE_MEASURED.class, fldMap);
	}

}
