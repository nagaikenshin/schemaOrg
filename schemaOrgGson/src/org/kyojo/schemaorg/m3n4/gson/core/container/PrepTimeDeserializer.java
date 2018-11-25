package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.PREP_TIME;
import org.kyojo.schemaorg.m3n4.core.Container.PrepTime;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class PrepTimeDeserializer implements JsonDeserializer<PrepTime> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PrepTime deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PREP_TIME(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PREP_TIME(), PrepTime.class, PREP_TIME.class, fldMap);
	}

}
