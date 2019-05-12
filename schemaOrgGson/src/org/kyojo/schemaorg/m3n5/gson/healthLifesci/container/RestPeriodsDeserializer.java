package org.kyojo.schemaorg.m3n5.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.REST_PERIODS;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.RestPeriods;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class RestPeriodsDeserializer implements JsonDeserializer<RestPeriods> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public RestPeriods deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new REST_PERIODS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new REST_PERIODS(), RestPeriods.class, REST_PERIODS.class, fldMap);
	}

}
