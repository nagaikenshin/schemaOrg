package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.WORK_PERFORMED;
import org.kyojo.schemaorg.m3n5.core.Container.WorkPerformed;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class WorkPerformedDeserializer implements JsonDeserializer<WorkPerformed> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public WorkPerformed deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new WORK_PERFORMED(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new WORK_PERFORMED(), WorkPerformed.class, WORK_PERFORMED.class, fldMap);
	}

}
