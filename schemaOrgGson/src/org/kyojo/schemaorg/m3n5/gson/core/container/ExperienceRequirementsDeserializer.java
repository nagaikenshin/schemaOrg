package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.EXPERIENCE_REQUIREMENTS;
import org.kyojo.schemaorg.m3n5.core.Container.ExperienceRequirements;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ExperienceRequirementsDeserializer implements JsonDeserializer<ExperienceRequirements> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ExperienceRequirements deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new EXPERIENCE_REQUIREMENTS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new EXPERIENCE_REQUIREMENTS(), ExperienceRequirements.class, EXPERIENCE_REQUIREMENTS.class, fldMap);
	}

}
