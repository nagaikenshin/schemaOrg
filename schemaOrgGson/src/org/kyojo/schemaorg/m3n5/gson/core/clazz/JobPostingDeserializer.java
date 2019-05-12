package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.JOB_POSTING;
import org.kyojo.schemaorg.m3n5.core.Clazz.JobPosting;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class JobPostingDeserializer implements JsonDeserializer<JobPosting> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public JobPosting deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new JOB_POSTING(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new JOB_POSTING(), JobPosting.class, JOB_POSTING.class, fldMap);
	}

}
