package org.kyojo.schemaorg.m3n4.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.BY_MONTH;
import org.kyojo.schemaorg.m3n4.pending.Container.ByMonth;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ByMonthDeserializer implements JsonDeserializer<ByMonth> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ByMonth deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			try {
				return new BY_MONTH(jsonElement.getAsLong());
			} catch(NumberFormatException nfe) {
				return null;
			}
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new BY_MONTH(), ByMonth.class, BY_MONTH.class, fldMap);
	}

}
