package org.kyojo.schemaorg.m3n5.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.COMPETENCY_REQUIRED;
import org.kyojo.schemaorg.m3n5.pending.Container.CompetencyRequired;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class CompetencyRequiredDeserializer implements JsonDeserializer<CompetencyRequired> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CompetencyRequired deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new COMPETENCY_REQUIRED(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new COMPETENCY_REQUIRED(), CompetencyRequired.class, COMPETENCY_REQUIRED.class, fldMap);
	}

}
