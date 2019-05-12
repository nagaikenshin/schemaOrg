package org.kyojo.schemaorg.m3n5.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.JOB_LOCATION_TYPE;
import org.kyojo.schemaorg.m3n5.pending.Container.JobLocationType;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class JobLocationTypeDeserializer implements JsonDeserializer<JobLocationType> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public JobLocationType deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new JOB_LOCATION_TYPE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new JOB_LOCATION_TYPE(), JobLocationType.class, JOB_LOCATION_TYPE.class, fldMap);
	}

}
