package org.kyojo.schemaorg.m3n5.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.BACKGROUND;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.Background;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class BackgroundDeserializer implements JsonDeserializer<Background> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Background deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new BACKGROUND(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new BACKGROUND(), Background.class, BACKGROUND.class, fldMap);
	}

}
