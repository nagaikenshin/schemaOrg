package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.WEIGHT;
import org.kyojo.schemaorg.m3n5.core.Container.Weight;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class WeightDeserializer implements JsonDeserializer<Weight> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Weight deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new WEIGHT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new WEIGHT(), Weight.class, WEIGHT.class, fldMap);
	}

}
