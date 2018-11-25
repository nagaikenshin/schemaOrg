package org.kyojo.schemaorg.m3n4.gson.bib.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.bib.impl.WORK_TRANSLATION;
import org.kyojo.schemaorg.m3n4.bib.Container.WorkTranslation;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class WorkTranslationDeserializer implements JsonDeserializer<WorkTranslation> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public WorkTranslation deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new WORK_TRANSLATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new WORK_TRANSLATION(), WorkTranslation.class, WORK_TRANSLATION.class, fldMap);
	}

}
