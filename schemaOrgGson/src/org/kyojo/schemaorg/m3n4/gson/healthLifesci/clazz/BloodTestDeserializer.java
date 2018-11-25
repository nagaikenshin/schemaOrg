package org.kyojo.schemaorg.m3n4.gson.healthLifesci.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.BLOOD_TEST;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.BloodTest;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class BloodTestDeserializer implements JsonDeserializer<BloodTest> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public BloodTest deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new BLOOD_TEST(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new BLOOD_TEST(), BloodTest.class, BLOOD_TEST.class, fldMap);
	}

}
