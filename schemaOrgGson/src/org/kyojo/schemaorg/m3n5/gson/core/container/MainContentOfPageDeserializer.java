package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.MAIN_CONTENT_OF_PAGE;
import org.kyojo.schemaorg.m3n5.core.Container.MainContentOfPage;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class MainContentOfPageDeserializer implements JsonDeserializer<MainContentOfPage> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MainContentOfPage deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MAIN_CONTENT_OF_PAGE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MAIN_CONTENT_OF_PAGE(), MainContentOfPage.class, MAIN_CONTENT_OF_PAGE.class, fldMap);
	}

}
