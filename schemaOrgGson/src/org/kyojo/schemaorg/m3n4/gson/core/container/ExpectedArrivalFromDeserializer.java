package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.EXPECTED_ARRIVAL_FROM;
import org.kyojo.schemaorg.m3n4.core.Container.ExpectedArrivalFrom;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ExpectedArrivalFromDeserializer implements JsonDeserializer<ExpectedArrivalFrom> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ExpectedArrivalFrom deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			java.time.OffsetDateTime dateTime = context.deserialize(jsonElement, java.time.OffsetDateTime.class);
			return new EXPECTED_ARRIVAL_FROM(dateTime);
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new EXPECTED_ARRIVAL_FROM(), ExpectedArrivalFrom.class, EXPECTED_ARRIVAL_FROM.class, fldMap);
	}

}
