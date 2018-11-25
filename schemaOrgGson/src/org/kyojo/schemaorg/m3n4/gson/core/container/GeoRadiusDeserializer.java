package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.GEO_RADIUS;
import org.kyojo.schemaorg.m3n4.core.Container.GeoRadius;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class GeoRadiusDeserializer implements JsonDeserializer<GeoRadius> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public GeoRadius deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new GEO_RADIUS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new GEO_RADIUS(), GeoRadius.class, GEO_RADIUS.class, fldMap);
	}

}
