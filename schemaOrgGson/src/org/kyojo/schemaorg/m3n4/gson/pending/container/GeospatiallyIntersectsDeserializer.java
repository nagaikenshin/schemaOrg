package org.kyojo.schemaorg.m3n4.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.GEOSPATIALLY_INTERSECTS;
import org.kyojo.schemaorg.m3n4.pending.Container.GeospatiallyIntersects;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class GeospatiallyIntersectsDeserializer implements JsonDeserializer<GeospatiallyIntersects> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public GeospatiallyIntersects deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new GEOSPATIALLY_INTERSECTS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new GEOSPATIALLY_INTERSECTS(), GeospatiallyIntersects.class, GEOSPATIALLY_INTERSECTS.class, fldMap);
	}

}
