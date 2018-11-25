package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.NUM_ADULTS;
import org.kyojo.schemaorg.m3n4.core.Container.NumAdults;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class NumAdultsDeserializer implements JsonDeserializer<NumAdults> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public NumAdults deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			try {
				return new NUM_ADULTS(jsonElement.getAsLong());
			} catch(NumberFormatException nfe) {
				return null;
			}
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new NUM_ADULTS(), NumAdults.class, NUM_ADULTS.class, fldMap);
	}

}
