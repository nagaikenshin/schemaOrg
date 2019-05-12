package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.ACTION_ACCESSIBILITY_REQUIREMENT;
import org.kyojo.schemaorg.m3n5.core.Container.ActionAccessibilityRequirement;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ActionAccessibilityRequirementDeserializer implements JsonDeserializer<ActionAccessibilityRequirement> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ActionAccessibilityRequirement deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ACTION_ACCESSIBILITY_REQUIREMENT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ACTION_ACCESSIBILITY_REQUIREMENT(), ActionAccessibilityRequirement.class, ACTION_ACCESSIBILITY_REQUIREMENT.class, fldMap);
	}

}
