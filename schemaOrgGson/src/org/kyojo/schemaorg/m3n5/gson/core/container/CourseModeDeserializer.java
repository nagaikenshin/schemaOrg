package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.COURSE_MODE;
import org.kyojo.schemaorg.m3n5.core.Container.CourseMode;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class CourseModeDeserializer implements JsonDeserializer<CourseMode> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CourseMode deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new COURSE_MODE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new COURSE_MODE(), CourseMode.class, COURSE_MODE.class, fldMap);
	}

}
