package org.kyojo.schemaorg.m3n4.gson.healthLifesci.physicalActivityCategory;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.physicalActivityCategory.STRENGTH_TRAINING;
import org.kyojo.schemaorg.m3n4.healthLifesci.PhysicalActivityCategory.StrengthTraining;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class StrengthTrainingDeserializer implements JsonDeserializer<StrengthTraining> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public StrengthTraining deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new STRENGTH_TRAINING(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new STRENGTH_TRAINING(), StrengthTraining.class, STRENGTH_TRAINING.class, fldMap);
	}

}
