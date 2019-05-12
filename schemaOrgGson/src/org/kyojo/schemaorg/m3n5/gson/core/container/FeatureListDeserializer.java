package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.FEATURE_LIST;
import org.kyojo.schemaorg.m3n5.core.Container.FeatureList;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class FeatureListDeserializer implements JsonDeserializer<FeatureList> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public FeatureList deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new FEATURE_LIST(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new FEATURE_LIST(), FeatureList.class, FEATURE_LIST.class, fldMap);
	}

}
