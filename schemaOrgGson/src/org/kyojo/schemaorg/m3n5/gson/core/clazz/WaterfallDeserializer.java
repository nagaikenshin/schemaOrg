package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.WATERFALL;
import org.kyojo.schemaorg.m3n5.core.Clazz.Waterfall;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class WaterfallDeserializer implements JsonDeserializer<Waterfall> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Waterfall deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new WATERFALL(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new WATERFALL(), Waterfall.class, WATERFALL.class, fldMap);
	}

}
