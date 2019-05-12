package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.JOB_TITLE;
import org.kyojo.schemaorg.m3n5.core.Container.JobTitle;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class JobTitleDeserializer implements JsonDeserializer<JobTitle> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public JobTitle deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new JOB_TITLE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new JOB_TITLE(), JobTitle.class, JOB_TITLE.class, fldMap);
	}

}
