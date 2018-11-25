package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.MIDDLE_SCHOOL;
import org.kyojo.schemaorg.m3n4.core.Clazz.MiddleSchool;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class MiddleSchoolDeserializer implements JsonDeserializer<MiddleSchool> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MiddleSchool deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MIDDLE_SCHOOL(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MIDDLE_SCHOOL(), MiddleSchool.class, MIDDLE_SCHOOL.class, fldMap);
	}

}
