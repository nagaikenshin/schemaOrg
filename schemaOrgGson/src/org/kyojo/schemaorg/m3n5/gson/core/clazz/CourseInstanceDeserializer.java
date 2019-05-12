package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.COURSE_INSTANCE;
import org.kyojo.schemaorg.m3n5.core.Clazz.CourseInstance;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class CourseInstanceDeserializer implements JsonDeserializer<CourseInstance> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CourseInstance deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new COURSE_INSTANCE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new COURSE_INSTANCE(), CourseInstance.class, COURSE_INSTANCE.class, fldMap);
	}

}
