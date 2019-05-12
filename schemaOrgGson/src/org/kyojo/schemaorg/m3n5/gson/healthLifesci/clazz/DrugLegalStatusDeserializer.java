package org.kyojo.schemaorg.m3n5.gson.healthLifesci.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.DRUG_LEGAL_STATUS;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.DrugLegalStatus;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class DrugLegalStatusDeserializer implements JsonDeserializer<DrugLegalStatus> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DrugLegalStatus deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DRUG_LEGAL_STATUS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DRUG_LEGAL_STATUS(), DrugLegalStatus.class, DRUG_LEGAL_STATUS.class, fldMap);
	}

}
