package org.kyojo.schemaorg.m3n4.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.IDENTIFYING_TEST;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.IdentifyingTest;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class IdentifyingTestDeserializer implements JsonDeserializer<IdentifyingTest> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public IdentifyingTest deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new IDENTIFYING_TEST(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new IDENTIFYING_TEST(), IdentifyingTest.class, IDENTIFYING_TEST.class, fldMap);
	}

}
