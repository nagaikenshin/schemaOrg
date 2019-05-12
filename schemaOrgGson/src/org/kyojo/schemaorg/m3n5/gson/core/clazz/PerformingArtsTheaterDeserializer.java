package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.PERFORMING_ARTS_THEATER;
import org.kyojo.schemaorg.m3n5.core.Clazz.PerformingArtsTheater;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class PerformingArtsTheaterDeserializer implements JsonDeserializer<PerformingArtsTheater> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PerformingArtsTheater deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PERFORMING_ARTS_THEATER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PERFORMING_ARTS_THEATER(), PerformingArtsTheater.class, PERFORMING_ARTS_THEATER.class, fldMap);
	}

}
