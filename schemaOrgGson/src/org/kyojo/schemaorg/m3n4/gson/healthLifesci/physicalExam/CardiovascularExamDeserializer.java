package org.kyojo.schemaorg.m3n4.gson.healthLifesci.physicalExam;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.physicalExam.CARDIOVASCULAR_EXAM;
import org.kyojo.schemaorg.m3n4.healthLifesci.PhysicalExam.CardiovascularExam;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class CardiovascularExamDeserializer implements JsonDeserializer<CardiovascularExam> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CardiovascularExam deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CARDIOVASCULAR_EXAM(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CARDIOVASCULAR_EXAM(), CardiovascularExam.class, CARDIOVASCULAR_EXAM.class, fldMap);
	}

}
