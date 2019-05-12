package org.kyojo.schemaorg.m3n5.gson.healthLifesci.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.PHYSICAL_ACTIVITY_CATEGORY;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.PhysicalActivityCategory;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class PhysicalActivityCategoryDeserializer implements JsonDeserializer<PhysicalActivityCategory> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PhysicalActivityCategory deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PHYSICAL_ACTIVITY_CATEGORY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PHYSICAL_ACTIVITY_CATEGORY(), PhysicalActivityCategory.class, PHYSICAL_ACTIVITY_CATEGORY.class, fldMap);
	}

}
