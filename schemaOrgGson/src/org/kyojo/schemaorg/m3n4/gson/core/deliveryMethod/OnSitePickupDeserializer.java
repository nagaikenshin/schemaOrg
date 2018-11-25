package org.kyojo.schemaorg.m3n4.gson.core.deliveryMethod;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.deliveryMethod.ON_SITE_PICKUP;
import org.kyojo.schemaorg.m3n4.core.DeliveryMethod.OnSitePickup;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class OnSitePickupDeserializer implements JsonDeserializer<OnSitePickup> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public OnSitePickup deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ON_SITE_PICKUP(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ON_SITE_PICKUP(), OnSitePickup.class, ON_SITE_PICKUP.class, fldMap);
	}

}
