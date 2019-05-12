package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.CREATIVE_WORK_SERIES;
import org.kyojo.schemaorg.m3n5.core.Clazz.CreativeWorkSeries;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class CreativeWorkSeriesDeserializer implements JsonDeserializer<CreativeWorkSeries> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CreativeWorkSeries deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CREATIVE_WORK_SERIES(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CREATIVE_WORK_SERIES(), CreativeWorkSeries.class, CREATIVE_WORK_SERIES.class, fldMap);
	}

}
