package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.BUSINESS_ENTITY_TYPE;
import org.kyojo.schemaorg.m3n4.core.Clazz.BusinessEntityType;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class BusinessEntityTypeDeserializer implements JsonDeserializer<BusinessEntityType> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public BusinessEntityType deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new BUSINESS_ENTITY_TYPE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new BUSINESS_ENTITY_TYPE(), BusinessEntityType.class, BUSINESS_ENTITY_TYPE.class, fldMap);
	}

}
