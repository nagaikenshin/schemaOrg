package org.kyojo.schemaorg.m3n5.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.BY_MONTH_DAY;
import org.kyojo.schemaorg.m3n5.pending.Container.ByMonthDay;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ByMonthDayDeserializer implements JsonDeserializer<ByMonthDay> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ByMonthDay deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			try {
				return new BY_MONTH_DAY(jsonElement.getAsLong());
			} catch(NumberFormatException nfe) {
				return null;
			}
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new BY_MONTH_DAY(), ByMonthDay.class, BY_MONTH_DAY.class, fldMap);
	}

}
