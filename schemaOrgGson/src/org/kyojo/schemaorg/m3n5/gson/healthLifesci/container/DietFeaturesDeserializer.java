package org.kyojo.schemaorg.m3n5.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.DIET_FEATURES;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.DietFeatures;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class DietFeaturesDeserializer implements JsonDeserializer<DietFeatures> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DietFeatures deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DIET_FEATURES(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DIET_FEATURES(), DietFeatures.class, DIET_FEATURES.class, fldMap);
	}

}