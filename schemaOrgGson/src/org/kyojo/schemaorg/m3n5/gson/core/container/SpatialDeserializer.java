package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.SPATIAL;
import org.kyojo.schemaorg.m3n5.core.Container.Spatial;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class SpatialDeserializer implements JsonDeserializer<Spatial> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Spatial deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SPATIAL(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SPATIAL(), Spatial.class, SPATIAL.class, fldMap);
	}

}
