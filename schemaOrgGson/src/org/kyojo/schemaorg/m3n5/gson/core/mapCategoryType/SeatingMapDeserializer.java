package org.kyojo.schemaorg.m3n5.gson.core.mapCategoryType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.mapCategoryType.SEATING_MAP;
import org.kyojo.schemaorg.m3n5.core.MapCategoryType.SeatingMap;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class SeatingMapDeserializer implements JsonDeserializer<SeatingMap> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SeatingMap deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SEATING_MAP(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SEATING_MAP(), SeatingMap.class, SEATING_MAP.class, fldMap);
	}

}
