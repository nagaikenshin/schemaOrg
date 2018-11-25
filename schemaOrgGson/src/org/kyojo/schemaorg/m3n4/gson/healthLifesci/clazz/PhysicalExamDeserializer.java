package org.kyojo.schemaorg.m3n4.gson.healthLifesci.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.PHYSICAL_EXAM;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.PhysicalExam;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class PhysicalExamDeserializer implements JsonDeserializer<PhysicalExam> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PhysicalExam deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PHYSICAL_EXAM(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PHYSICAL_EXAM(), PhysicalExam.class, PHYSICAL_EXAM.class, fldMap);
	}

}
