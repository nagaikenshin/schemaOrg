package org.kyojo.schemaorg.m3n5.gson.auto.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.auto.impl.TONGUE_WEIGHT;
import org.kyojo.schemaorg.m3n5.auto.Container.TongueWeight;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class TongueWeightDeserializer implements JsonDeserializer<TongueWeight> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public TongueWeight deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new TONGUE_WEIGHT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new TONGUE_WEIGHT(), TongueWeight.class, TONGUE_WEIGHT.class, fldMap);
	}

}
