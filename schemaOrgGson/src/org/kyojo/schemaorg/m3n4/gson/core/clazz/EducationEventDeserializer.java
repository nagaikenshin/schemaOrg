package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.EDUCATION_EVENT;
import org.kyojo.schemaorg.m3n4.core.Clazz.EducationEvent;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class EducationEventDeserializer implements JsonDeserializer<EducationEvent> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public EducationEvent deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new EDUCATION_EVENT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new EDUCATION_EVENT(), EducationEvent.class, EDUCATION_EVENT.class, fldMap);
	}

}
