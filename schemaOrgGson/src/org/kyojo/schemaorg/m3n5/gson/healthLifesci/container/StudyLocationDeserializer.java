package org.kyojo.schemaorg.m3n5.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.STUDY_LOCATION;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.StudyLocation;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class StudyLocationDeserializer implements JsonDeserializer<StudyLocation> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public StudyLocation deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new STUDY_LOCATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new STUDY_LOCATION(), StudyLocation.class, STUDY_LOCATION.class, fldMap);
	}

}
