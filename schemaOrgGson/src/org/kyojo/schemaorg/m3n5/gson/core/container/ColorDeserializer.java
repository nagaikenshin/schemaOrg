package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.COLOR;
import org.kyojo.schemaorg.m3n5.core.Container.Color;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ColorDeserializer implements JsonDeserializer<Color> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Color deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new COLOR(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new COLOR(), Color.class, COLOR.class, fldMap);
	}

}
