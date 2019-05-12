package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.SOFTWARE_REQUIREMENTS;
import org.kyojo.schemaorg.m3n5.core.Container.SoftwareRequirements;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class SoftwareRequirementsDeserializer implements JsonDeserializer<SoftwareRequirements> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SoftwareRequirements deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SOFTWARE_REQUIREMENTS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SOFTWARE_REQUIREMENTS(), SoftwareRequirements.class, SOFTWARE_REQUIREMENTS.class, fldMap);
	}

}
