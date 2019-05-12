package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.CANDIDATE;
import org.kyojo.schemaorg.m3n5.core.Container.Candidate;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class CandidateDeserializer implements JsonDeserializer<Candidate> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Candidate deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CANDIDATE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CANDIDATE(), Candidate.class, CANDIDATE.class, fldMap);
	}

}
