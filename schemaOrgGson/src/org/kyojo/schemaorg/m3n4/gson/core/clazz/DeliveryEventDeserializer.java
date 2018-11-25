package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.DELIVERY_EVENT;
import org.kyojo.schemaorg.m3n4.core.Clazz.DeliveryEvent;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class DeliveryEventDeserializer implements JsonDeserializer<DeliveryEvent> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DeliveryEvent deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DELIVERY_EVENT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DELIVERY_EVENT(), DeliveryEvent.class, DELIVERY_EVENT.class, fldMap);
	}

}
