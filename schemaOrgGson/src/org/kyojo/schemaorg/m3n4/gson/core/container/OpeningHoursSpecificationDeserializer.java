package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.OPENING_HOURS_SPECIFICATION;
import org.kyojo.schemaorg.m3n4.core.Container.OpeningHoursSpecification;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class OpeningHoursSpecificationDeserializer implements JsonDeserializer<OpeningHoursSpecification> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public OpeningHoursSpecification deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new OPENING_HOURS_SPECIFICATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new OPENING_HOURS_SPECIFICATION(), OpeningHoursSpecification.class, OPENING_HOURS_SPECIFICATION.class, fldMap);
	}

}
