package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.PAINT_ACTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.PaintAction;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class PaintActionDeserializer implements JsonDeserializer<PaintAction> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PaintAction deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PAINT_ACTION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PAINT_ACTION(), PaintAction.class, PAINT_ACTION.class, fldMap);
	}

}
