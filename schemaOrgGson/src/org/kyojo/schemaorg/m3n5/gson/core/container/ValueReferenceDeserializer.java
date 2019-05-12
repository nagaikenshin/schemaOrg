package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.VALUE_REFERENCE;
import org.kyojo.schemaorg.m3n5.core.Container.ValueReference;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ValueReferenceDeserializer implements JsonDeserializer<ValueReference> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ValueReference deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new VALUE_REFERENCE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new VALUE_REFERENCE(), ValueReference.class, VALUE_REFERENCE.class, fldMap);
	}

}
