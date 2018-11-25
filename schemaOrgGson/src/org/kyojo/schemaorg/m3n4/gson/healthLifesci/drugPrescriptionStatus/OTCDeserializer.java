package org.kyojo.schemaorg.m3n4.gson.healthLifesci.drugPrescriptionStatus;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.drugPrescriptionStatus.OTC;
import org.kyojo.schemaorg.m3n4.healthLifesci.DrugPrescriptionStatus;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class OTCDeserializer implements JsonDeserializer<DrugPrescriptionStatus.OTC> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DrugPrescriptionStatus.OTC deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new OTC(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new OTC(), DrugPrescriptionStatus.OTC.class, OTC.class, fldMap);
	}

}
