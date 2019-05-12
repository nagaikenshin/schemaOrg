package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.PROPERTY_VALUE;
import org.kyojo.schemaorg.m3n5.core.Clazz.PropertyValue;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class PropertyValueDeserializer implements JsonDeserializer<PropertyValue> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PropertyValue deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PROPERTY_VALUE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PROPERTY_VALUE(), PropertyValue.class, PROPERTY_VALUE.class, fldMap);
	}

}
