package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.SITE_NAVIGATION_ELEMENT;
import org.kyojo.schemaorg.m3n4.core.Clazz.SiteNavigationElement;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class SiteNavigationElementDeserializer implements JsonDeserializer<SiteNavigationElement> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SiteNavigationElement deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SITE_NAVIGATION_ELEMENT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SITE_NAVIGATION_ELEMENT(), SiteNavigationElement.class, SITE_NAVIGATION_ELEMENT.class, fldMap);
	}

}
