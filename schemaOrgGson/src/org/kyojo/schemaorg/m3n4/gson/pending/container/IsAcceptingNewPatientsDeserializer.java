package org.kyojo.schemaorg.m3n4.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.IS_ACCEPTING_NEW_PATIENTS;
import org.kyojo.schemaorg.m3n4.pending.Container.IsAcceptingNewPatients;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class IsAcceptingNewPatientsDeserializer implements JsonDeserializer<IsAcceptingNewPatients> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public IsAcceptingNewPatients deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new IS_ACCEPTING_NEW_PATIENTS(jsonElement.getAsBoolean());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new IS_ACCEPTING_NEW_PATIENTS(), IsAcceptingNewPatients.class, IS_ACCEPTING_NEW_PATIENTS.class, fldMap);
	}

}
