package org.kyojo.schemaorg.m3n4.gson.auto.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.auto.impl.MODEL_DATE;
import org.kyojo.schemaorg.m3n4.auto.Container.ModelDate;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ModelDateDeserializer implements JsonDeserializer<ModelDate> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ModelDate deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			java.time.LocalDate date = context.deserialize(jsonElement, java.time.LocalDate.class);
			return new MODEL_DATE(date);
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MODEL_DATE(), ModelDate.class, MODEL_DATE.class, fldMap);
	}

}
