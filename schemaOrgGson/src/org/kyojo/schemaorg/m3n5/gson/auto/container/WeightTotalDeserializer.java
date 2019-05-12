package org.kyojo.schemaorg.m3n5.gson.auto.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.auto.impl.WEIGHT_TOTAL;
import org.kyojo.schemaorg.m3n5.auto.Container.WeightTotal;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class WeightTotalDeserializer implements JsonDeserializer<WeightTotal> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public WeightTotal deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new WEIGHT_TOTAL(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new WEIGHT_TOTAL(), WeightTotal.class, WEIGHT_TOTAL.class, fldMap);
	}

}
