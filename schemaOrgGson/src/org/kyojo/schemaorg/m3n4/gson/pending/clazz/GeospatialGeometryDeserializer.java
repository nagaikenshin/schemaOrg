package org.kyojo.schemaorg.m3n4.gson.pending.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.GEOSPATIAL_GEOMETRY;
import org.kyojo.schemaorg.m3n4.pending.Clazz.GeospatialGeometry;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class GeospatialGeometryDeserializer implements JsonDeserializer<GeospatialGeometry> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public GeospatialGeometry deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new GEOSPATIAL_GEOMETRY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new GEOSPATIAL_GEOMETRY(), GeospatialGeometry.class, GEOSPATIAL_GEOMETRY.class, fldMap);
	}

}
