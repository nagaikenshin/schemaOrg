package org.kyojo.schemaorg.m3n4.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.REQUIRES_SUBSCRIPTION;
import org.kyojo.schemaorg.m3n4.pending.Container.RequiresSubscription;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class RequiresSubscriptionDeserializer implements JsonDeserializer<RequiresSubscription> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public RequiresSubscription deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new REQUIRES_SUBSCRIPTION(jsonElement.getAsBoolean());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new REQUIRES_SUBSCRIPTION(), RequiresSubscription.class, REQUIRES_SUBSCRIPTION.class, fldMap);
	}

}
