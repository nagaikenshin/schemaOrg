package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.AVAILABLE_DELIVERY_METHOD;
import org.kyojo.schemaorg.m3n5.core.Container.AvailableDeliveryMethod;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class AvailableDeliveryMethodDeserializer implements JsonDeserializer<AvailableDeliveryMethod> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AvailableDeliveryMethod deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new AVAILABLE_DELIVERY_METHOD(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new AVAILABLE_DELIVERY_METHOD(), AvailableDeliveryMethod.class, AVAILABLE_DELIVERY_METHOD.class, fldMap);
	}

}
