package org.kyojo.schemaorg.m3n4.gson.pending.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.CATEGORY_CODE;
import org.kyojo.schemaorg.m3n4.pending.Clazz.CategoryCode;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class CategoryCodeDeserializer implements JsonDeserializer<CategoryCode> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CategoryCode deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CATEGORY_CODE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CATEGORY_CODE(), CategoryCode.class, CATEGORY_CODE.class, fldMap);
	}

}
