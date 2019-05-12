package org.kyojo.schemaorg.m3n5.gson.core.mapCategoryType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.mapCategoryType.VENUE_MAP;
import org.kyojo.schemaorg.m3n5.core.MapCategoryType.VenueMap;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class VenueMapDeserializer implements JsonDeserializer<VenueMap> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public VenueMap deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new VENUE_MAP(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new VENUE_MAP(), VenueMap.class, VENUE_MAP.class, fldMap);
	}

}
