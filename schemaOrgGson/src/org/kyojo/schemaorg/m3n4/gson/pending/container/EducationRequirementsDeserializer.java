package org.kyojo.schemaorg.m3n4.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.EDUCATION_REQUIREMENTS;
import org.kyojo.schemaorg.m3n4.pending.Container.EducationRequirements;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class EducationRequirementsDeserializer implements JsonDeserializer<EducationRequirements> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public EducationRequirements deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new EDUCATION_REQUIREMENTS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new EDUCATION_REQUIREMENTS(), EducationRequirements.class, EDUCATION_REQUIREMENTS.class, fldMap);
	}

}
