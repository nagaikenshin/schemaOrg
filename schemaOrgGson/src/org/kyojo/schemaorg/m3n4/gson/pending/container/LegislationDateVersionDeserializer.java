package org.kyojo.schemaorg.m3n4.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.LEGISLATION_DATE_VERSION;
import org.kyojo.schemaorg.m3n4.pending.Container.LegislationDateVersion;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class LegislationDateVersionDeserializer implements JsonDeserializer<LegislationDateVersion> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public LegislationDateVersion deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			java.time.LocalDate date = context.deserialize(jsonElement, java.time.LocalDate.class);
			return new LEGISLATION_DATE_VERSION(date);
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new LEGISLATION_DATE_VERSION(), LegislationDateVersion.class, LEGISLATION_DATE_VERSION.class, fldMap);
	}

}
