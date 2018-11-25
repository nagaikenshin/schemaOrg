package org.kyojo.schemaorg.m3n4.gson.healthLifesci.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.MEDICAL_CODE;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalCode;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class MedicalCodeDeserializer implements JsonDeserializer<MedicalCode> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MedicalCode deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MEDICAL_CODE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MEDICAL_CODE(), MedicalCode.class, MEDICAL_CODE.class, fldMap);
	}

}
