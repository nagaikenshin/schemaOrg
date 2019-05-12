package org.kyojo.schemaorg.m3n5.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.APPLICABLE_LOCATION;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.ApplicableLocation;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ApplicableLocationDeserializer implements JsonDeserializer<ApplicableLocation> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ApplicableLocation deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new APPLICABLE_LOCATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new APPLICABLE_LOCATION(), ApplicableLocation.class, APPLICABLE_LOCATION.class, fldMap);
	}

}
