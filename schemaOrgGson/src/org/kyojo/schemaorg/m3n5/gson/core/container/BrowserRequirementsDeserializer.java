package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.BROWSER_REQUIREMENTS;
import org.kyojo.schemaorg.m3n5.core.Container.BrowserRequirements;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class BrowserRequirementsDeserializer implements JsonDeserializer<BrowserRequirements> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public BrowserRequirements deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new BROWSER_REQUIREMENTS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new BROWSER_REQUIREMENTS(), BrowserRequirements.class, BROWSER_REQUIREMENTS.class, fldMap);
	}

}