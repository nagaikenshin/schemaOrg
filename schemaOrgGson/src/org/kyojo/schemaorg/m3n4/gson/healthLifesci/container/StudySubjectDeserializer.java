package org.kyojo.schemaorg.m3n4.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.STUDY_SUBJECT;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.StudySubject;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class StudySubjectDeserializer implements JsonDeserializer<StudySubject> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public StudySubject deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new STUDY_SUBJECT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new STUDY_SUBJECT(), StudySubject.class, STUDY_SUBJECT.class, fldMap);
	}

}
