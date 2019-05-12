package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.WEB_CHECKIN_TIME;
import org.kyojo.schemaorg.m3n5.core.Container.WebCheckinTime;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class WebCheckinTimeDeserializer implements JsonDeserializer<WebCheckinTime> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public WebCheckinTime deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			java.time.OffsetDateTime dateTime = context.deserialize(jsonElement, java.time.OffsetDateTime.class);
			return new WEB_CHECKIN_TIME(dateTime);
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new WEB_CHECKIN_TIME(), WebCheckinTime.class, WEB_CHECKIN_TIME.class, fldMap);
	}

}
