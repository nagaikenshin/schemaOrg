package org.kyojo.schemaorg.m3n4.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.LEGISLATION_RESPONSIBLE;
import org.kyojo.schemaorg.m3n4.pending.Container.LegislationResponsible;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class LegislationResponsibleDeserializer implements JsonDeserializer<LegislationResponsible> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public LegislationResponsible deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new LEGISLATION_RESPONSIBLE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new LEGISLATION_RESPONSIBLE(), LegislationResponsible.class, LEGISLATION_RESPONSIBLE.class, fldMap);
	}

}
