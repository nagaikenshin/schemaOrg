package org.kyojo.schemaorg.m3n4.gson.healthLifesci.medicalObservationalStudyDesign;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.medicalObservationalStudyDesign.OBSERVATIONAL;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalObservationalStudyDesign.Observational;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ObservationalDeserializer implements JsonDeserializer<Observational> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Observational deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new OBSERVATIONAL(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new OBSERVATIONAL(), Observational.class, OBSERVATIONAL.class, fldMap);
	}

}
