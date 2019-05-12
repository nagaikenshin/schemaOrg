package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.PROFICIENCY_LEVEL;
import org.kyojo.schemaorg.m3n5.core.Container.ProficiencyLevel;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ProficiencyLevelDeserializer implements JsonDeserializer<ProficiencyLevel> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ProficiencyLevel deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PROFICIENCY_LEVEL(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PROFICIENCY_LEVEL(), ProficiencyLevel.class, PROFICIENCY_LEVEL.class, fldMap);
	}

}
