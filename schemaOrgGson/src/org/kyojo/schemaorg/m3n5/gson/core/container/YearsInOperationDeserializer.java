package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.YEARS_IN_OPERATION;
import org.kyojo.schemaorg.m3n5.core.Container.YearsInOperation;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class YearsInOperationDeserializer implements JsonDeserializer<YearsInOperation> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public YearsInOperation deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new YEARS_IN_OPERATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new YEARS_IN_OPERATION(), YearsInOperation.class, YEARS_IN_OPERATION.class, fldMap);
	}

}
