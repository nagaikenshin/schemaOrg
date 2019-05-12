package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.GOLF_COURSE;
import org.kyojo.schemaorg.m3n5.core.Clazz.GolfCourse;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class GolfCourseDeserializer implements JsonDeserializer<GolfCourse> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public GolfCourse deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new GOLF_COURSE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new GOLF_COURSE(), GolfCourse.class, GOLF_COURSE.class, fldMap);
	}

}
