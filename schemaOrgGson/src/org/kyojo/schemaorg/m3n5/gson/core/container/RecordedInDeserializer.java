package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.RECORDED_IN;
import org.kyojo.schemaorg.m3n5.core.Container.RecordedIn;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class RecordedInDeserializer implements JsonDeserializer<RecordedIn> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public RecordedIn deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new RECORDED_IN(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new RECORDED_IN(), RecordedIn.class, RECORDED_IN.class, fldMap);
	}

}
