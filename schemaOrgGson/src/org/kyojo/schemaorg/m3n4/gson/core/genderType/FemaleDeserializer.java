package org.kyojo.schemaorg.m3n4.gson.core.genderType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.genderType.FEMALE;
import org.kyojo.schemaorg.m3n4.core.GenderType.Female;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class FemaleDeserializer implements JsonDeserializer<Female> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Female deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new FEMALE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new FEMALE(), Female.class, FEMALE.class, fldMap);
	}

}
