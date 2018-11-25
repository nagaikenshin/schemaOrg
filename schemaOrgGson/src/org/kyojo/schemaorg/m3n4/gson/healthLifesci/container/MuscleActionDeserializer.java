package org.kyojo.schemaorg.m3n4.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.MUSCLE_ACTION;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.MuscleAction;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class MuscleActionDeserializer implements JsonDeserializer<MuscleAction> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MuscleAction deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MUSCLE_ACTION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MUSCLE_ACTION(), MuscleAction.class, MUSCLE_ACTION.class, fldMap);
	}

}
