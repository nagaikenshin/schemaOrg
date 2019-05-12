package org.kyojo.schemaorg.m3n5.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.USED_TO_DIAGNOSE;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.UsedToDiagnose;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class UsedToDiagnoseDeserializer implements JsonDeserializer<UsedToDiagnose> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public UsedToDiagnose deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new USED_TO_DIAGNOSE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new USED_TO_DIAGNOSE(), UsedToDiagnose.class, USED_TO_DIAGNOSE.class, fldMap);
	}

}
