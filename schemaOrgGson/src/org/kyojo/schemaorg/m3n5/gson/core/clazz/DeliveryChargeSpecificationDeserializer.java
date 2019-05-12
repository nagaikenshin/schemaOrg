package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.DELIVERY_CHARGE_SPECIFICATION;
import org.kyojo.schemaorg.m3n5.core.Clazz.DeliveryChargeSpecification;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class DeliveryChargeSpecificationDeserializer implements JsonDeserializer<DeliveryChargeSpecification> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DeliveryChargeSpecification deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DELIVERY_CHARGE_SPECIFICATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DELIVERY_CHARGE_SPECIFICATION(), DeliveryChargeSpecification.class, DELIVERY_CHARGE_SPECIFICATION.class, fldMap);
	}

}
