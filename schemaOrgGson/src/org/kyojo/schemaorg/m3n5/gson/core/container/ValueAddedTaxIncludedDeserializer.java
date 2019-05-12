package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.VALUE_ADDED_TAX_INCLUDED;
import org.kyojo.schemaorg.m3n5.core.Container.ValueAddedTaxIncluded;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ValueAddedTaxIncludedDeserializer implements JsonDeserializer<ValueAddedTaxIncluded> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ValueAddedTaxIncluded deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new VALUE_ADDED_TAX_INCLUDED(jsonElement.getAsBoolean());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new VALUE_ADDED_TAX_INCLUDED(), ValueAddedTaxIncluded.class, VALUE_ADDED_TAX_INCLUDED.class, fldMap);
	}

}
