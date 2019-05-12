package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.DAY_SPA;
import org.kyojo.schemaorg.m3n5.core.Clazz.DaySpa;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class DaySpaDeserializer implements JsonDeserializer<DaySpa> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DaySpa deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DAY_SPA(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DAY_SPA(), DaySpa.class, DAY_SPA.class, fldMap);
	}

}
