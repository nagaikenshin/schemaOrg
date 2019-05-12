package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.WP_FOOTER;
import org.kyojo.schemaorg.m3n5.core.Clazz.WPFooter;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class WPFooterDeserializer implements JsonDeserializer<WPFooter> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public WPFooter deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new WP_FOOTER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new WP_FOOTER(), WPFooter.class, WP_FOOTER.class, fldMap);
	}

}
