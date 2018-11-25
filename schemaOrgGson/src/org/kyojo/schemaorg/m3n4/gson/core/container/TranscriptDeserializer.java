package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.TRANSCRIPT;
import org.kyojo.schemaorg.m3n4.core.Container.Transcript;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class TranscriptDeserializer implements JsonDeserializer<Transcript> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Transcript deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new TRANSCRIPT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new TRANSCRIPT(), Transcript.class, TRANSCRIPT.class, fldMap);
	}

}
