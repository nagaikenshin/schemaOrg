package org.kyojo.schemaorg.m3n5.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.TYPICAL_TEST;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.TypicalTest;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class TypicalTestDeserializer implements JsonDeserializer<TypicalTest> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public TypicalTest deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new TYPICAL_TEST(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new TYPICAL_TEST(), TypicalTest.class, TYPICAL_TEST.class, fldMap);
	}

}
