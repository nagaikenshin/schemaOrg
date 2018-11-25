package org.kyojo.schemaorg.m3n4.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.GEOSPATIALLY_CROSSES;
import org.kyojo.schemaorg.m3n4.pending.Container.GeospatiallyCrosses;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class GeospatiallyCrossesDeserializer implements JsonDeserializer<GeospatiallyCrosses> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public GeospatiallyCrosses deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new GEOSPATIALLY_CROSSES(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new GEOSPATIALLY_CROSSES(), GeospatiallyCrosses.class, GEOSPATIALLY_CROSSES.class, fldMap);
	}

}
