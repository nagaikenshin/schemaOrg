package org.kyojo.schemaorg.m3n4.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.CLINICAL_PHARMACOLOGY;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.ClinicalPharmacology;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ClinicalPharmacologyDeserializer implements JsonDeserializer<ClinicalPharmacology> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ClinicalPharmacology deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CLINICAL_PHARMACOLOGY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CLINICAL_PHARMACOLOGY(), ClinicalPharmacology.class, CLINICAL_PHARMACOLOGY.class, fldMap);
	}

}
