package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.OPENS;
import org.kyojo.schemaorg.m3n5.core.Container.Opens;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class OpensDeserializer implements JsonDeserializer<Opens> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Opens deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			java.time.LocalTime time = context.deserialize(jsonElement, java.time.LocalTime.class);
			return new OPENS(time);
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new OPENS(), Opens.class, OPENS.class, fldMap);
	}

}
