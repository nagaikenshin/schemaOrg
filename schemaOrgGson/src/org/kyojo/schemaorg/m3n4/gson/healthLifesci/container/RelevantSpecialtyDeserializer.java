package org.kyojo.schemaorg.m3n4.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.RELEVANT_SPECIALTY;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.RelevantSpecialty;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class RelevantSpecialtyDeserializer implements JsonDeserializer<RelevantSpecialty> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public RelevantSpecialty deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new RELEVANT_SPECIALTY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new RELEVANT_SPECIALTY(), RelevantSpecialty.class, RELEVANT_SPECIALTY.class, fldMap);
	}

}
