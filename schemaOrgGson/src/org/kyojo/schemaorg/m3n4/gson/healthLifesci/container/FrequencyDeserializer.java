package org.kyojo.schemaorg.m3n4.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.FREQUENCY;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.Frequency;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class FrequencyDeserializer implements JsonDeserializer<Frequency> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Frequency deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new FREQUENCY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new FREQUENCY(), Frequency.class, FREQUENCY.class, fldMap);
	}

}
