package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.TRACKING_NUMBER;
import org.kyojo.schemaorg.m3n4.core.Container.TrackingNumber;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class TrackingNumberDeserializer implements JsonDeserializer<TrackingNumber> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public TrackingNumber deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new TRACKING_NUMBER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new TRACKING_NUMBER(), TrackingNumber.class, TRACKING_NUMBER.class, fldMap);
	}

}
