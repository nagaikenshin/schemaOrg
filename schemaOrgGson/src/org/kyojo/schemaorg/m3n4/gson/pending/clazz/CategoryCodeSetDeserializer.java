package org.kyojo.schemaorg.m3n4.gson.pending.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.CATEGORY_CODE_SET;
import org.kyojo.schemaorg.m3n4.pending.Clazz.CategoryCodeSet;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class CategoryCodeSetDeserializer implements JsonDeserializer<CategoryCodeSet> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CategoryCodeSet deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CATEGORY_CODE_SET(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CATEGORY_CODE_SET(), CategoryCodeSet.class, CATEGORY_CODE_SET.class, fldMap);
	}

}
