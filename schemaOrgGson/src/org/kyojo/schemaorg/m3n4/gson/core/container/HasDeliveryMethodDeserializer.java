package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.HAS_DELIVERY_METHOD;
import org.kyojo.schemaorg.m3n4.core.Container.HasDeliveryMethod;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class HasDeliveryMethodDeserializer implements JsonDeserializer<HasDeliveryMethod> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public HasDeliveryMethod deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new HAS_DELIVERY_METHOD(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new HAS_DELIVERY_METHOD(), HasDeliveryMethod.class, HAS_DELIVERY_METHOD.class, fldMap);
	}

}
