package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.GEO_OVERLAPS;
import org.kyojo.schemaorg.m3n5.core.Container.GeoOverlaps;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class GeoOverlapsDeserializer implements JsonDeserializer<GeoOverlaps> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public GeoOverlaps deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new GEO_OVERLAPS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new GEO_OVERLAPS(), GeoOverlaps.class, GEO_OVERLAPS.class, fldMap);
	}

}
