package org.kyojo.schemaorg.m3n4.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.GEOSPATIALLY_OVERLAPS;
import org.kyojo.schemaorg.m3n4.pending.Container.GeospatiallyOverlaps;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class GeospatiallyOverlapsDeserializer implements JsonDeserializer<GeospatiallyOverlaps> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public GeospatiallyOverlaps deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new GEOSPATIALLY_OVERLAPS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new GEOSPATIALLY_OVERLAPS(), GeospatiallyOverlaps.class, GEOSPATIALLY_OVERLAPS.class, fldMap);
	}

}
