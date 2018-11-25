package org.kyojo.schemaorg.m3n4.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.GUIDELINE_DATE;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.GuidelineDate;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class GuidelineDateDeserializer implements JsonDeserializer<GuidelineDate> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public GuidelineDate deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			java.time.LocalDate date = context.deserialize(jsonElement, java.time.LocalDate.class);
			return new GUIDELINE_DATE(date);
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new GUIDELINE_DATE(), GuidelineDate.class, GUIDELINE_DATE.class, fldMap);
	}

}
