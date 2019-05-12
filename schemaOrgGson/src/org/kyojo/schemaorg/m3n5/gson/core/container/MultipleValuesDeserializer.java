package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.MULTIPLE_VALUES;
import org.kyojo.schemaorg.m3n5.core.Container.MultipleValues;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class MultipleValuesDeserializer implements JsonDeserializer<MultipleValues> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MultipleValues deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MULTIPLE_VALUES(jsonElement.getAsBoolean());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MULTIPLE_VALUES(), MultipleValues.class, MULTIPLE_VALUES.class, fldMap);
	}

}
