package org.kyojo.schemaorg.m3n5.gson.healthLifesci.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.PSYCHOLOGICAL_TREATMENT;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.PsychologicalTreatment;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class PsychologicalTreatmentDeserializer implements JsonDeserializer<PsychologicalTreatment> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PsychologicalTreatment deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PSYCHOLOGICAL_TREATMENT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PSYCHOLOGICAL_TREATMENT(), PsychologicalTreatment.class, PSYCHOLOGICAL_TREATMENT.class, fldMap);
	}

}