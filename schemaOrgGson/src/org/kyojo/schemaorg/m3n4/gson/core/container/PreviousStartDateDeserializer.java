package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.PREVIOUS_START_DATE;
import org.kyojo.schemaorg.m3n4.core.Container.PreviousStartDate;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class PreviousStartDateDeserializer implements JsonDeserializer<PreviousStartDate> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PreviousStartDate deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			java.time.LocalDate date = context.deserialize(jsonElement, java.time.LocalDate.class);
			return new PREVIOUS_START_DATE(date);
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PREVIOUS_START_DATE(), PreviousStartDate.class, PREVIOUS_START_DATE.class, fldMap);
	}

}
