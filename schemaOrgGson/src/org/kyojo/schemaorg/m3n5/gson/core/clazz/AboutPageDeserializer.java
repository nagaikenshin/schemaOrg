package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.ABOUT_PAGE;
import org.kyojo.schemaorg.m3n5.core.Clazz.AboutPage;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class AboutPageDeserializer implements JsonDeserializer<AboutPage> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AboutPage deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ABOUT_PAGE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ABOUT_PAGE(), AboutPage.class, ABOUT_PAGE.class, fldMap);
	}

}
