package org.kyojo.schemaorg.m3n4.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.FIRST_APPEARANCE;
import org.kyojo.schemaorg.m3n4.pending.Container.FirstAppearance;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class FirstAppearanceDeserializer implements JsonDeserializer<FirstAppearance> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public FirstAppearance deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new FIRST_APPEARANCE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new FIRST_APPEARANCE(), FirstAppearance.class, FIRST_APPEARANCE.class, fldMap);
	}

}
