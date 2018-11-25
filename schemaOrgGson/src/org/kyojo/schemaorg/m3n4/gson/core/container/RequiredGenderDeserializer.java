package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.REQUIRED_GENDER;
import org.kyojo.schemaorg.m3n4.core.Container.RequiredGender;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class RequiredGenderDeserializer implements JsonDeserializer<RequiredGender> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public RequiredGender deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new REQUIRED_GENDER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new REQUIRED_GENDER(), RequiredGender.class, REQUIRED_GENDER.class, fldMap);
	}

}
