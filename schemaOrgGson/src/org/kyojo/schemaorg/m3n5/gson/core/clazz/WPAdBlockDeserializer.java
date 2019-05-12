package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.WP_AD_BLOCK;
import org.kyojo.schemaorg.m3n5.core.Clazz.WPAdBlock;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class WPAdBlockDeserializer implements JsonDeserializer<WPAdBlock> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public WPAdBlock deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new WP_AD_BLOCK(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new WP_AD_BLOCK(), WPAdBlock.class, WP_AD_BLOCK.class, fldMap);
	}

}
