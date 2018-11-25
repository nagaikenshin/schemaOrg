package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.APPLICATION_SUB_CATEGORY;
import org.kyojo.schemaorg.m3n4.core.Container.ApplicationSubCategory;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ApplicationSubCategoryDeserializer implements JsonDeserializer<ApplicationSubCategory> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ApplicationSubCategory deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new APPLICATION_SUB_CATEGORY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new APPLICATION_SUB_CATEGORY(), ApplicationSubCategory.class, APPLICATION_SUB_CATEGORY.class, fldMap);
	}

}
