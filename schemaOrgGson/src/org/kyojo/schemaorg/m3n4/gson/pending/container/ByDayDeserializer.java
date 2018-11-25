package org.kyojo.schemaorg.m3n4.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.BY_DAY;
import org.kyojo.schemaorg.m3n4.pending.Container.ByDay;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ByDayDeserializer implements JsonDeserializer<ByDay> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ByDay deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new BY_DAY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new BY_DAY(), ByDay.class, BY_DAY.class, fldMap);
	}

}
