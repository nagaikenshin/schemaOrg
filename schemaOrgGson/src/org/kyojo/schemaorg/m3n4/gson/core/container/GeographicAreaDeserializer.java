package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.GEOGRAPHIC_AREA;
import org.kyojo.schemaorg.m3n4.core.Container.GeographicArea;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class GeographicAreaDeserializer implements JsonDeserializer<GeographicArea> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public GeographicArea deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new GEOGRAPHIC_AREA(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new GEOGRAPHIC_AREA(), GeographicArea.class, GEOGRAPHIC_AREA.class, fldMap);
	}

}
