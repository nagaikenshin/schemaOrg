package org.kyojo.schemaorg.m3n5.gson.healthLifesci.physicalExam;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.physicalExam.NOSE;
import org.kyojo.schemaorg.m3n5.healthLifesci.PhysicalExam.Nose;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class NoseDeserializer implements JsonDeserializer<Nose> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Nose deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new NOSE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new NOSE(), Nose.class, NOSE.class, fldMap);
	}

}
