package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.ADDITIONAL_TYPE;
import org.kyojo.schemaorg.m3n5.core.Container.AdditionalType;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class AdditionalTypeDeserializer implements JsonDeserializer<AdditionalType> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AdditionalType deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ADDITIONAL_TYPE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ADDITIONAL_TYPE(), AdditionalType.class, ADDITIONAL_TYPE.class, fldMap);
	}

}
