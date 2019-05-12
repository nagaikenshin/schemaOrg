package org.kyojo.schemaorg.m3n5.gson.auto.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.auto.impl.TRAILER_WEIGHT;
import org.kyojo.schemaorg.m3n5.auto.Container.TrailerWeight;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class TrailerWeightDeserializer implements JsonDeserializer<TrailerWeight> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public TrailerWeight deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new TRAILER_WEIGHT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new TRAILER_WEIGHT(), TrailerWeight.class, TRAILER_WEIGHT.class, fldMap);
	}

}
