package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.GEO_CROSSES;
import org.kyojo.schemaorg.m3n5.core.Container.GeoCrosses;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class GeoCrossesDeserializer implements JsonDeserializer<GeoCrosses> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public GeoCrosses deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new GEO_CROSSES(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new GEO_CROSSES(), GeoCrosses.class, GEO_CROSSES.class, fldMap);
	}

}
