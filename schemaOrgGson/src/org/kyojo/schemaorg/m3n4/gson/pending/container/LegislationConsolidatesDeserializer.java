package org.kyojo.schemaorg.m3n4.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.LEGISLATION_CONSOLIDATES;
import org.kyojo.schemaorg.m3n4.pending.Container.LegislationConsolidates;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class LegislationConsolidatesDeserializer implements JsonDeserializer<LegislationConsolidates> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public LegislationConsolidates deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new LEGISLATION_CONSOLIDATES(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new LEGISLATION_CONSOLIDATES(), LegislationConsolidates.class, LEGISLATION_CONSOLIDATES.class, fldMap);
	}

}
