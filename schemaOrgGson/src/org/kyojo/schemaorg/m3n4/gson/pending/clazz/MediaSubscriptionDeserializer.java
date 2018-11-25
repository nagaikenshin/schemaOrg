package org.kyojo.schemaorg.m3n4.gson.pending.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.MEDIA_SUBSCRIPTION;
import org.kyojo.schemaorg.m3n4.pending.Clazz.MediaSubscription;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class MediaSubscriptionDeserializer implements JsonDeserializer<MediaSubscription> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MediaSubscription deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MEDIA_SUBSCRIPTION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MEDIA_SUBSCRIPTION(), MediaSubscription.class, MEDIA_SUBSCRIPTION.class, fldMap);
	}

}
