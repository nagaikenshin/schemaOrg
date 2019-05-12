package org.kyojo.schemaorg.m3n5.gson.healthLifesci.medicalImagingTechnique;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.medicalImagingTechnique.MRI;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicalImagingTechnique;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class MRIDeserializer implements JsonDeserializer<MedicalImagingTechnique.MRI> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MedicalImagingTechnique.MRI deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MRI(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MRI(), MedicalImagingTechnique.MRI.class, MRI.class, fldMap);
	}

}