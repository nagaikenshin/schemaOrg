package org.kyojo.schemaorg.m3n4.gson.healthLifesci.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.PATHOLOGY_TEST;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.PathologyTest;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class PathologyTestDeserializer implements JsonDeserializer<PathologyTest> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PathologyTest deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PATHOLOGY_TEST(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PATHOLOGY_TEST(), PathologyTest.class, PATHOLOGY_TEST.class, fldMap);
	}

}
