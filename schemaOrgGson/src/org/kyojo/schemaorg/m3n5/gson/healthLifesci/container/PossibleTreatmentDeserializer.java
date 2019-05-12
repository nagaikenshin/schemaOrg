package org.kyojo.schemaorg.m3n5.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.POSSIBLE_TREATMENT;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.PossibleTreatment;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class PossibleTreatmentDeserializer implements JsonDeserializer<PossibleTreatment> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PossibleTreatment deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new POSSIBLE_TREATMENT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new POSSIBLE_TREATMENT(), PossibleTreatment.class, POSSIBLE_TREATMENT.class, fldMap);
	}

}
