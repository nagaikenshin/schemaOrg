package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.ADDITIONAL_PROPERTY;
import org.kyojo.schemaorg.m3n4.core.Container.AdditionalProperty;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class AdditionalPropertyDeserializer implements JsonDeserializer<AdditionalProperty> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AdditionalProperty deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ADDITIONAL_PROPERTY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ADDITIONAL_PROPERTY(), AdditionalProperty.class, ADDITIONAL_PROPERTY.class, fldMap);
	}

}
