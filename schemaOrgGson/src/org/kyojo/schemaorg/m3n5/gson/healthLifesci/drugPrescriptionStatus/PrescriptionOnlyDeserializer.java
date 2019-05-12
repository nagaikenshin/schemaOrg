package org.kyojo.schemaorg.m3n5.gson.healthLifesci.drugPrescriptionStatus;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.drugPrescriptionStatus.PRESCRIPTION_ONLY;
import org.kyojo.schemaorg.m3n5.healthLifesci.DrugPrescriptionStatus.PrescriptionOnly;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class PrescriptionOnlyDeserializer implements JsonDeserializer<PrescriptionOnly> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PrescriptionOnly deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PRESCRIPTION_ONLY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PRESCRIPTION_ONLY(), PrescriptionOnly.class, PRESCRIPTION_ONLY.class, fldMap);
	}

}