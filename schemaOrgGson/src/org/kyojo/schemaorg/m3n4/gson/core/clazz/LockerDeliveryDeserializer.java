package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.LOCKER_DELIVERY;
import org.kyojo.schemaorg.m3n4.core.Clazz.LockerDelivery;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class LockerDeliveryDeserializer implements JsonDeserializer<LockerDelivery> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public LockerDelivery deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new LOCKER_DELIVERY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new LOCKER_DELIVERY(), LockerDelivery.class, LOCKER_DELIVERY.class, fldMap);
	}

}
