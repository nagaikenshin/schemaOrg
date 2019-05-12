package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.MAIN_ENTITY_OF_PAGE;
import org.kyojo.schemaorg.m3n5.core.Container.MainEntityOfPage;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class MainEntityOfPageDeserializer implements JsonDeserializer<MainEntityOfPage> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MainEntityOfPage deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MAIN_ENTITY_OF_PAGE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MAIN_ENTITY_OF_PAGE(), MainEntityOfPage.class, MAIN_ENTITY_OF_PAGE.class, fldMap);
	}

}
