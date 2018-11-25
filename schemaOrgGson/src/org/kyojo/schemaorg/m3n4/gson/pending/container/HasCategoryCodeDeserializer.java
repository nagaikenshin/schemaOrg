package org.kyojo.schemaorg.m3n4.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.HAS_CATEGORY_CODE;
import org.kyojo.schemaorg.m3n4.pending.Container.HasCategoryCode;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class HasCategoryCodeDeserializer implements JsonDeserializer<HasCategoryCode> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public HasCategoryCode deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new HAS_CATEGORY_CODE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new HAS_CATEGORY_CODE(), HasCategoryCode.class, HAS_CATEGORY_CODE.class, fldMap);
	}

}
