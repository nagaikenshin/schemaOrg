package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.HIGH_SCHOOL;
import org.kyojo.schemaorg.m3n4.core.Clazz.HighSchool;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class HighSchoolDeserializer implements JsonDeserializer<HighSchool> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public HighSchool deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new HIGH_SCHOOL(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new HIGH_SCHOOL(), HighSchool.class, HIGH_SCHOOL.class, fldMap);
	}

}
