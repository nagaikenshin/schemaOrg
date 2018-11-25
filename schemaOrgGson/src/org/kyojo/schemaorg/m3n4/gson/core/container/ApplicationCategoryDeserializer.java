package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.APPLICATION_CATEGORY;
import org.kyojo.schemaorg.m3n4.core.Container.ApplicationCategory;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ApplicationCategoryDeserializer implements JsonDeserializer<ApplicationCategory> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ApplicationCategory deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new APPLICATION_CATEGORY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new APPLICATION_CATEGORY(), ApplicationCategory.class, APPLICATION_CATEGORY.class, fldMap);
	}

}
