package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.MOUNTAIN;
import org.kyojo.schemaorg.m3n4.core.Clazz.Mountain;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class MountainDeserializer implements JsonDeserializer<Mountain> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Mountain deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MOUNTAIN(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MOUNTAIN(), Mountain.class, MOUNTAIN.class, fldMap);
	}

}
