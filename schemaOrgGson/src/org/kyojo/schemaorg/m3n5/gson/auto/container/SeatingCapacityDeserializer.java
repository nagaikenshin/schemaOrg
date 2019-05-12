package org.kyojo.schemaorg.m3n5.gson.auto.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.auto.impl.SEATING_CAPACITY;
import org.kyojo.schemaorg.m3n5.auto.Container.SeatingCapacity;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class SeatingCapacityDeserializer implements JsonDeserializer<SeatingCapacity> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SeatingCapacity deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SEATING_CAPACITY(jsonElement.getAsBigDecimal());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SEATING_CAPACITY(), SeatingCapacity.class, SEATING_CAPACITY.class, fldMap);
	}

}
