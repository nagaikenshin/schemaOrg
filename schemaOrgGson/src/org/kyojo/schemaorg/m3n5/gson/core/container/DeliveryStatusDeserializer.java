package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.DELIVERY_STATUS;
import org.kyojo.schemaorg.m3n5.core.Container.DeliveryStatus;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class DeliveryStatusDeserializer implements JsonDeserializer<DeliveryStatus> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DeliveryStatus deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DELIVERY_STATUS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DELIVERY_STATUS(), DeliveryStatus.class, DELIVERY_STATUS.class, fldMap);
	}

}
