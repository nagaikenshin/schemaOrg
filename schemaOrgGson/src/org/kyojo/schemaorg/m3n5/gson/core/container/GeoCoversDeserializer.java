package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.GEO_COVERS;
import org.kyojo.schemaorg.m3n5.core.Container.GeoCovers;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class GeoCoversDeserializer implements JsonDeserializer<GeoCovers> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public GeoCovers deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new GEO_COVERS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new GEO_COVERS(), GeoCovers.class, GEO_COVERS.class, fldMap);
	}

}
