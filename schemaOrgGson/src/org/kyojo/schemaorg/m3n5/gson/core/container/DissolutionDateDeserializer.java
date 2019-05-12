package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.DISSOLUTION_DATE;
import org.kyojo.schemaorg.m3n5.core.Container.DissolutionDate;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class DissolutionDateDeserializer implements JsonDeserializer<DissolutionDate> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DissolutionDate deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			java.time.LocalDate date = context.deserialize(jsonElement, java.time.LocalDate.class);
			return new DISSOLUTION_DATE(date);
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DISSOLUTION_DATE(), DissolutionDate.class, DISSOLUTION_DATE.class, fldMap);
	}

}
