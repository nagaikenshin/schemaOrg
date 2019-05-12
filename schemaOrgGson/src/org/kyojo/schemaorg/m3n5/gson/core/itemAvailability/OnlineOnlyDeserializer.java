package org.kyojo.schemaorg.m3n5.gson.core.itemAvailability;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.itemAvailability.ONLINE_ONLY;
import org.kyojo.schemaorg.m3n5.core.ItemAvailability.OnlineOnly;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class OnlineOnlyDeserializer implements JsonDeserializer<OnlineOnly> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public OnlineOnly deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ONLINE_ONLY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ONLINE_ONLY(), OnlineOnly.class, ONLINE_ONLY.class, fldMap);
	}

}
