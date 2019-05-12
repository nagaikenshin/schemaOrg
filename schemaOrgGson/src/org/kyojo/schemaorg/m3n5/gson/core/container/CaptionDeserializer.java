package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.CAPTION;
import org.kyojo.schemaorg.m3n5.core.Container.Caption;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class CaptionDeserializer implements JsonDeserializer<Caption> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Caption deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CAPTION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CAPTION(), Caption.class, CAPTION.class, fldMap);
	}

}
