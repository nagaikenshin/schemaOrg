package org.kyojo.schemaorg.m3n5.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.SUB_TEST;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.SubTest;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class SubTestDeserializer implements JsonDeserializer<SubTest> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SubTest deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SUB_TEST(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SUB_TEST(), SubTest.class, SUB_TEST.class, fldMap);
	}

}
