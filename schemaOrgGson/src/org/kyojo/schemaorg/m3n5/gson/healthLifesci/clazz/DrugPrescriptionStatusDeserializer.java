package org.kyojo.schemaorg.m3n5.gson.healthLifesci.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.DRUG_PRESCRIPTION_STATUS;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.DrugPrescriptionStatus;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class DrugPrescriptionStatusDeserializer implements JsonDeserializer<DrugPrescriptionStatus> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DrugPrescriptionStatus deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DRUG_PRESCRIPTION_STATUS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DRUG_PRESCRIPTION_STATUS(), DrugPrescriptionStatus.class, DRUG_PRESCRIPTION_STATUS.class, fldMap);
	}

}
