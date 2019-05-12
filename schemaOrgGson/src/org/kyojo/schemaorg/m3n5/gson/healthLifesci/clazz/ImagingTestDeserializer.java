package org.kyojo.schemaorg.m3n5.gson.healthLifesci.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.IMAGING_TEST;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.ImagingTest;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ImagingTestDeserializer implements JsonDeserializer<ImagingTest> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ImagingTest deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new IMAGING_TEST(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new IMAGING_TEST(), ImagingTest.class, IMAGING_TEST.class, fldMap);
	}

}
