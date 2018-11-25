package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.INELIGIBLE_REGION;
import org.kyojo.schemaorg.m3n4.core.Container.IneligibleRegion;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class IneligibleRegionDeserializer implements JsonDeserializer<IneligibleRegion> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public IneligibleRegion deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new INELIGIBLE_REGION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new INELIGIBLE_REGION(), IneligibleRegion.class, INELIGIBLE_REGION.class, fldMap);
	}

}
