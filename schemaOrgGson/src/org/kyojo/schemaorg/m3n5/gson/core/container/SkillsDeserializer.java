package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.SKILLS;
import org.kyojo.schemaorg.m3n5.core.Container.Skills;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class SkillsDeserializer implements JsonDeserializer<Skills> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Skills deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SKILLS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SKILLS(), Skills.class, SKILLS.class, fldMap);
	}

}
