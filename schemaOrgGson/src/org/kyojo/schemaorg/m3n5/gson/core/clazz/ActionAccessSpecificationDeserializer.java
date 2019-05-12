package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.ACTION_ACCESS_SPECIFICATION;
import org.kyojo.schemaorg.m3n5.core.Clazz.ActionAccessSpecification;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ActionAccessSpecificationDeserializer implements JsonDeserializer<ActionAccessSpecification> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ActionAccessSpecification deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ACTION_ACCESS_SPECIFICATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ACTION_ACCESS_SPECIFICATION(), ActionAccessSpecification.class, ACTION_ACCESS_SPECIFICATION.class, fldMap);
	}

}
