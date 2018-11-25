package org.kyojo.schemaorg.m3n4.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.EXERCISE_RELATED_DIET;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.ExerciseRelatedDiet;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ExerciseRelatedDietDeserializer implements JsonDeserializer<ExerciseRelatedDiet> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ExerciseRelatedDiet deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new EXERCISE_RELATED_DIET(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new EXERCISE_RELATED_DIET(), ExerciseRelatedDiet.class, EXERCISE_RELATED_DIET.class, fldMap);
	}

}
