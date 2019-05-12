package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.SPECIAL_OPENING_HOURS_SPECIFICATION;
import org.kyojo.schemaorg.m3n5.core.Container.SpecialOpeningHoursSpecification;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class SpecialOpeningHoursSpecificationDeserializer implements JsonDeserializer<SpecialOpeningHoursSpecification> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SpecialOpeningHoursSpecification deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SPECIAL_OPENING_HOURS_SPECIFICATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SPECIAL_OPENING_HOURS_SPECIFICATION(), SpecialOpeningHoursSpecification.class, SPECIAL_OPENING_HOURS_SPECIFICATION.class, fldMap);
	}

}
