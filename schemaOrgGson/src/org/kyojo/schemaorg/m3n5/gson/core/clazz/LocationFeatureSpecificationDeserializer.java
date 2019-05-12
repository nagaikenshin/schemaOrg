package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.LOCATION_FEATURE_SPECIFICATION;
import org.kyojo.schemaorg.m3n5.core.Clazz.LocationFeatureSpecification;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class LocationFeatureSpecificationDeserializer implements JsonDeserializer<LocationFeatureSpecification> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public LocationFeatureSpecification deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new LOCATION_FEATURE_SPECIFICATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new LOCATION_FEATURE_SPECIFICATION(), LocationFeatureSpecification.class, LOCATION_FEATURE_SPECIFICATION.class, fldMap);
	}

}
