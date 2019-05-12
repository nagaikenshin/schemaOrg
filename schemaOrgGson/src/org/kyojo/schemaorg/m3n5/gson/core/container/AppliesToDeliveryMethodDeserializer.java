package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.APPLIES_TO_DELIVERY_METHOD;
import org.kyojo.schemaorg.m3n5.core.Container.AppliesToDeliveryMethod;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class AppliesToDeliveryMethodDeserializer implements JsonDeserializer<AppliesToDeliveryMethod> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AppliesToDeliveryMethod deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new APPLIES_TO_DELIVERY_METHOD(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new APPLIES_TO_DELIVERY_METHOD(), AppliesToDeliveryMethod.class, APPLIES_TO_DELIVERY_METHOD.class, fldMap);
	}

}
