package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.HOUSE_PAINTER;
import org.kyojo.schemaorg.m3n5.core.Clazz.HousePainter;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class HousePainterDeserializer implements JsonDeserializer<HousePainter> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public HousePainter deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new HOUSE_PAINTER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new HOUSE_PAINTER(), HousePainter.class, HOUSE_PAINTER.class, fldMap);
	}

}
