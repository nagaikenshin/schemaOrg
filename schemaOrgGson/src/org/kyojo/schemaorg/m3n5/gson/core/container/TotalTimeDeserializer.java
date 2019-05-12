package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.TOTAL_TIME;
import org.kyojo.schemaorg.m3n5.core.Container.TotalTime;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class TotalTimeDeserializer implements JsonDeserializer<TotalTime> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public TotalTime deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new TOTAL_TIME(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new TOTAL_TIME(), TotalTime.class, TOTAL_TIME.class, fldMap);
	}

}
