package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.GEO_MIDPOINT;
import org.kyojo.schemaorg.m3n4.core.Container.GeoMidpoint;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class GeoMidpointDeserializer implements JsonDeserializer<GeoMidpoint> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public GeoMidpoint deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new GEO_MIDPOINT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new GEO_MIDPOINT(), GeoMidpoint.class, GEO_MIDPOINT.class, fldMap);
	}

}
