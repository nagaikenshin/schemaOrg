package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.SCHEDULED_PAYMENT_DATE;
import org.kyojo.schemaorg.m3n5.core.Container.ScheduledPaymentDate;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ScheduledPaymentDateDeserializer implements JsonDeserializer<ScheduledPaymentDate> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ScheduledPaymentDate deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			java.time.LocalDate date = context.deserialize(jsonElement, java.time.LocalDate.class);
			return new SCHEDULED_PAYMENT_DATE(date);
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SCHEDULED_PAYMENT_DATE(), ScheduledPaymentDate.class, SCHEDULED_PAYMENT_DATE.class, fldMap);
	}

}