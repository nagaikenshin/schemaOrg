package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.RECORDING_OF;
import org.kyojo.schemaorg.m3n5.core.Container.RecordingOf;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class RecordingOfDeserializer implements JsonDeserializer<RecordingOf> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public RecordingOf deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new RECORDING_OF(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new RECORDING_OF(), RecordingOf.class, RECORDING_OF.class, fldMap);
	}

}
