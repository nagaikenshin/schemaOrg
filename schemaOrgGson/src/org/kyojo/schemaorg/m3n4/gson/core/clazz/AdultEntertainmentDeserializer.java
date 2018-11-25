package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.ADULT_ENTERTAINMENT;
import org.kyojo.schemaorg.m3n4.core.Clazz.AdultEntertainment;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class AdultEntertainmentDeserializer implements JsonDeserializer<AdultEntertainment> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AdultEntertainment deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ADULT_ENTERTAINMENT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ADULT_ENTERTAINMENT(), AdultEntertainment.class, ADULT_ENTERTAINMENT.class, fldMap);
	}

}
