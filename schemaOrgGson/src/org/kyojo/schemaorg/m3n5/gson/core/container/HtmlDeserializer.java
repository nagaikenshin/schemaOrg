package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.HTML;
import org.kyojo.schemaorg.m3n5.core.Container.Html;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class HtmlDeserializer implements JsonDeserializer<Html> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Html deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new HTML(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new HTML(), Html.class, HTML.class, fldMap);
	}

}
