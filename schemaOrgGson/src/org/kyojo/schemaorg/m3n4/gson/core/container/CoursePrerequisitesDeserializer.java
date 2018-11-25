package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.COURSE_PREREQUISITES;
import org.kyojo.schemaorg.m3n4.core.Container.CoursePrerequisites;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class CoursePrerequisitesDeserializer implements JsonDeserializer<CoursePrerequisites> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CoursePrerequisites deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new COURSE_PREREQUISITES(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new COURSE_PREREQUISITES(), CoursePrerequisites.class, COURSE_PREREQUISITES.class, fldMap);
	}

}
