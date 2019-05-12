package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.GEO_TOUCHES;
import org.kyojo.schemaorg.m3n5.core.Container.GeoTouches;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class GeoTouchesDeserializer implements JsonDeserializer<GeoTouches> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public GeoTouches deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new GEO_TOUCHES(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new GEO_TOUCHES(), GeoTouches.class, GEO_TOUCHES.class, fldMap);
	}

}
