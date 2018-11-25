package org.kyojo.schemaorg.m3n4.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.SERIOUS_ADVERSE_OUTCOME;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.SeriousAdverseOutcome;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class SeriousAdverseOutcomeDeserializer implements JsonDeserializer<SeriousAdverseOutcome> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SeriousAdverseOutcome deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SERIOUS_ADVERSE_OUTCOME(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SERIOUS_ADVERSE_OUTCOME(), SeriousAdverseOutcome.class, SERIOUS_ADVERSE_OUTCOME.class, fldMap);
	}

}
