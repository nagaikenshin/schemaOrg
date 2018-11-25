package org.kyojo.schemaorg.m3n4.gson.healthLifesci.medicalImagingTechnique;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.medicalImagingTechnique.CT;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalImagingTechnique;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class CTDeserializer implements JsonDeserializer<MedicalImagingTechnique.CT> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MedicalImagingTechnique.CT deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CT(), MedicalImagingTechnique.CT.class, CT.class, fldMap);
	}

}
