package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.ARRIVAL_TIME;
import org.kyojo.schemaorg.m3n4.core.Container.ArrivalTime;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ArrivalTimeDeserializer implements JsonDeserializer<ArrivalTime> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ArrivalTime deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			java.time.OffsetDateTime dateTime = context.deserialize(jsonElement, java.time.OffsetDateTime.class);
			return new ARRIVAL_TIME(dateTime);
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ARRIVAL_TIME(), ArrivalTime.class, ARRIVAL_TIME.class, fldMap);
	}

}
