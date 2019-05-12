package org.kyojo.schemaorg.m3n5.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.LEGISLATION_DATE;
import org.kyojo.schemaorg.m3n5.pending.Container.LegislationDate;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class LegislationDateDeserializer implements JsonDeserializer<LegislationDate> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public LegislationDate deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			java.time.OffsetDateTime dateTime = context.deserialize(jsonElement, java.time.OffsetDateTime.class);
			return new LEGISLATION_DATE(dateTime);
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new LEGISLATION_DATE(), LegislationDate.class, LEGISLATION_DATE.class, fldMap);
	}

}
