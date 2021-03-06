package org.kyojo.schemaorg.m3n5.gson.healthLifesci.medicalImagingTechnique;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.medicalImagingTechnique.RADIOGRAPHY;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicalImagingTechnique.Radiography;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class RadiographyDeserializer implements JsonDeserializer<Radiography> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Radiography deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new RADIOGRAPHY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new RADIOGRAPHY(), Radiography.class, RADIOGRAPHY.class, fldMap);
	}

}
