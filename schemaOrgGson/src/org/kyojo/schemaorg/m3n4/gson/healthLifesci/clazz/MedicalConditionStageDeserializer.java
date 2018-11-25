package org.kyojo.schemaorg.m3n4.gson.healthLifesci.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.MEDICAL_CONDITION_STAGE;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalConditionStage;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class MedicalConditionStageDeserializer implements JsonDeserializer<MedicalConditionStage> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MedicalConditionStage deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MEDICAL_CONDITION_STAGE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MEDICAL_CONDITION_STAGE(), MedicalConditionStage.class, MEDICAL_CONDITION_STAGE.class, fldMap);
	}

}
