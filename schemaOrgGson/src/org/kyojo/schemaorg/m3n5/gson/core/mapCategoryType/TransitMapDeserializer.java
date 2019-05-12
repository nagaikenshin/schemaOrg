package org.kyojo.schemaorg.m3n5.gson.core.mapCategoryType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.mapCategoryType.TRANSIT_MAP;
import org.kyojo.schemaorg.m3n5.core.MapCategoryType.TransitMap;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class TransitMapDeserializer implements JsonDeserializer<TransitMap> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public TransitMap deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new TRANSIT_MAP(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new TRANSIT_MAP(), TransitMap.class, TRANSIT_MAP.class, fldMap);
	}

}
