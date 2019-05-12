package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.EXERCISE_GYM;
import org.kyojo.schemaorg.m3n5.core.Clazz.ExerciseGym;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ExerciseGymDeserializer implements JsonDeserializer<ExerciseGym> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ExerciseGym deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new EXERCISE_GYM(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new EXERCISE_GYM(), ExerciseGym.class, EXERCISE_GYM.class, fldMap);
	}

}
