package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.HAS_MENU_SECTION;
import org.kyojo.schemaorg.m3n4.core.Container.HasMenuSection;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class HasMenuSectionDeserializer implements JsonDeserializer<HasMenuSection> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public HasMenuSection deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new HAS_MENU_SECTION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new HAS_MENU_SECTION(), HasMenuSection.class, HAS_MENU_SECTION.class, fldMap);
	}

}
