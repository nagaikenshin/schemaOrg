package org.kyojo.schemaorg.m3n4.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.RECOMMENDED_INTAKE;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.RecommendedIntake;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class RecommendedIntakeDeserializer implements JsonDeserializer<RecommendedIntake> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public RecommendedIntake deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new RECOMMENDED_INTAKE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new RECOMMENDED_INTAKE(), RecommendedIntake.class, RECOMMENDED_INTAKE.class, fldMap);
	}

}
