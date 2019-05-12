package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.SUGGESTED_GENDER;
import org.kyojo.schemaorg.m3n5.core.Container.SuggestedGender;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class SuggestedGenderDeserializer implements JsonDeserializer<SuggestedGender> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SuggestedGender deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SUGGESTED_GENDER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SUGGESTED_GENDER(), SuggestedGender.class, SUGGESTED_GENDER.class, fldMap);
	}

}
