package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.GEO_COORDINATES;
import org.kyojo.schemaorg.m3n4.core.Clazz.GeoCoordinates;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class GeoCoordinatesDeserializer implements JsonDeserializer<GeoCoordinates> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public GeoCoordinates deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new GEO_COORDINATES(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new GEO_COORDINATES(), GeoCoordinates.class, GEO_COORDINATES.class, fldMap);
	}

}
