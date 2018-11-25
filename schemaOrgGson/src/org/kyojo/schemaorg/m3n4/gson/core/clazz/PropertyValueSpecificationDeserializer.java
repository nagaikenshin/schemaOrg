package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.PROPERTY_VALUE_SPECIFICATION;
import org.kyojo.schemaorg.m3n4.core.Clazz.PropertyValueSpecification;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class PropertyValueSpecificationDeserializer implements JsonDeserializer<PropertyValueSpecification> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PropertyValueSpecification deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PROPERTY_VALUE_SPECIFICATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PROPERTY_VALUE_SPECIFICATION(), PropertyValueSpecification.class, PROPERTY_VALUE_SPECIFICATION.class, fldMap);
	}

}
