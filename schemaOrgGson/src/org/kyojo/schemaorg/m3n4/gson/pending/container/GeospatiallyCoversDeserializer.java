package org.kyojo.schemaorg.m3n4.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.GEOSPATIALLY_COVERS;
import org.kyojo.schemaorg.m3n4.pending.Container.GeospatiallyCovers;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class GeospatiallyCoversDeserializer implements JsonDeserializer<GeospatiallyCovers> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public GeospatiallyCovers deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new GEOSPATIALLY_COVERS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new GEOSPATIALLY_COVERS(), GeospatiallyCovers.class, GEOSPATIALLY_COVERS.class, fldMap);
	}

}
