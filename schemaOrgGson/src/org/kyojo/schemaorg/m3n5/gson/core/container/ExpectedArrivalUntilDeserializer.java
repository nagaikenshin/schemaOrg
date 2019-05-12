package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.EXPECTED_ARRIVAL_UNTIL;
import org.kyojo.schemaorg.m3n5.core.Container.ExpectedArrivalUntil;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ExpectedArrivalUntilDeserializer implements JsonDeserializer<ExpectedArrivalUntil> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ExpectedArrivalUntil deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			java.time.OffsetDateTime dateTime = context.deserialize(jsonElement, java.time.OffsetDateTime.class);
			return new EXPECTED_ARRIVAL_UNTIL(dateTime);
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new EXPECTED_ARRIVAL_UNTIL(), ExpectedArrivalUntil.class, EXPECTED_ARRIVAL_UNTIL.class, fldMap);
	}

}
