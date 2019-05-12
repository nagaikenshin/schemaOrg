package org.kyojo.schemaorg.m3n5.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.SIGN_OR_SYMPTOM;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.SignOrSymptom;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class SignOrSymptomDeserializer implements JsonDeserializer<SignOrSymptom> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SignOrSymptom deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SIGN_OR_SYMPTOM(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SIGN_OR_SYMPTOM(), SignOrSymptom.class, SIGN_OR_SYMPTOM.class, fldMap);
	}

}
