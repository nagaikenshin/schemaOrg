package org.kyojo.schemaorg.m3n5.gson.auto.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.auto.impl.CAR_USAGE_TYPE;
import org.kyojo.schemaorg.m3n5.auto.Clazz.CarUsageType;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class CarUsageTypeDeserializer implements JsonDeserializer<CarUsageType> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CarUsageType deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CAR_USAGE_TYPE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CAR_USAGE_TYPE(), CarUsageType.class, CAR_USAGE_TYPE.class, fldMap);
	}

}
