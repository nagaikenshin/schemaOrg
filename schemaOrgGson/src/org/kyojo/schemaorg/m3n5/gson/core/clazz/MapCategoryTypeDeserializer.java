package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.MAP_CATEGORY_TYPE;
import org.kyojo.schemaorg.m3n5.core.Clazz.MapCategoryType;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class MapCategoryTypeDeserializer implements JsonDeserializer<MapCategoryType> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MapCategoryType deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MAP_CATEGORY_TYPE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MAP_CATEGORY_TYPE(), MapCategoryType.class, MAP_CATEGORY_TYPE.class, fldMap);
	}

}