package org.kyojo.schemaorg.m3n4.gson.healthLifesci.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.MEDICAL_INDICATION;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalIndication;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class MedicalIndicationDeserializer implements JsonDeserializer<MedicalIndication> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MedicalIndication deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MEDICAL_INDICATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MEDICAL_INDICATION(), MedicalIndication.class, MEDICAL_INDICATION.class, fldMap);
	}

}
