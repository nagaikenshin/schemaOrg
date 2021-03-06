package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.GEO_SHAPE;
import org.kyojo.schemaorg.m3n4.core.Clazz.GeoShape;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class GeoShapeDeserializer implements JsonDeserializer<GeoShape> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public GeoShape deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new GEO_SHAPE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new GEO_SHAPE(), GeoShape.class, GEO_SHAPE.class, fldMap);
	}

}
