package org.kyojo.schemaorg.m3n4.gson.core.genderType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.genderType.MALE;
import org.kyojo.schemaorg.m3n4.core.GenderType.Male;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class MaleDeserializer implements JsonDeserializer<Male> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Male deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MALE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MALE(), Male.class, MALE.class, fldMap);
	}

}
