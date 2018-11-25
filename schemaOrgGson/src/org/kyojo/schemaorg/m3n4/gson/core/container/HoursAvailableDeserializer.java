package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.HOURS_AVAILABLE;
import org.kyojo.schemaorg.m3n4.core.Container.HoursAvailable;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class HoursAvailableDeserializer implements JsonDeserializer<HoursAvailable> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public HoursAvailable deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new HOURS_AVAILABLE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new HOURS_AVAILABLE(), HoursAvailable.class, HOURS_AVAILABLE.class, fldMap);
	}

}
