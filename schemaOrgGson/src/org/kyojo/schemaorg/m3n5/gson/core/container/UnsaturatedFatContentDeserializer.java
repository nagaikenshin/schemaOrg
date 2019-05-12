package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.UNSATURATED_FAT_CONTENT;
import org.kyojo.schemaorg.m3n5.core.Container.UnsaturatedFatContent;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class UnsaturatedFatContentDeserializer implements JsonDeserializer<UnsaturatedFatContent> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public UnsaturatedFatContent deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new UNSATURATED_FAT_CONTENT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new UNSATURATED_FAT_CONTENT(), UnsaturatedFatContent.class, UNSATURATED_FAT_CONTENT.class, fldMap);
	}

}
