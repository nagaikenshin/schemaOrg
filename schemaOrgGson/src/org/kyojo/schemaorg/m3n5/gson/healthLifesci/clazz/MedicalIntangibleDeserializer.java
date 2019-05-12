package org.kyojo.schemaorg.m3n5.gson.healthLifesci.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.MEDICAL_INTANGIBLE;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.MedicalIntangible;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class MedicalIntangibleDeserializer implements JsonDeserializer<MedicalIntangible> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MedicalIntangible deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MEDICAL_INTANGIBLE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MEDICAL_INTANGIBLE(), MedicalIntangible.class, MEDICAL_INTANGIBLE.class, fldMap);
	}

}
