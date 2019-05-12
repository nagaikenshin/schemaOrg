package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.MEDIAN;
import org.kyojo.schemaorg.m3n5.core.Container.Median;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class MedianDeserializer implements JsonDeserializer<Median> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Median deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MEDIAN(jsonElement.getAsBigDecimal());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MEDIAN(), Median.class, MEDIAN.class, fldMap);
	}

}
