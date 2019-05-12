package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.WORK_PRESENTED;
import org.kyojo.schemaorg.m3n5.core.Container.WorkPresented;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class WorkPresentedDeserializer implements JsonDeserializer<WorkPresented> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public WorkPresented deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new WORK_PRESENTED(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new WORK_PRESENTED(), WorkPresented.class, WORK_PRESENTED.class, fldMap);
	}

}
