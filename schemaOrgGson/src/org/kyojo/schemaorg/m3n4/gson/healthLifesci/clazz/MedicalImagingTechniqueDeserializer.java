package org.kyojo.schemaorg.m3n4.gson.healthLifesci.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.MEDICAL_IMAGING_TECHNIQUE;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalImagingTechnique;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class MedicalImagingTechniqueDeserializer implements JsonDeserializer<MedicalImagingTechnique> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MedicalImagingTechnique deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MEDICAL_IMAGING_TECHNIQUE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MEDICAL_IMAGING_TECHNIQUE(), MedicalImagingTechnique.class, MEDICAL_IMAGING_TECHNIQUE.class, fldMap);
	}

}
