package org.kyojo.schemaorg.m3n5.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.RECOGNIZED_BY;
import org.kyojo.schemaorg.m3n5.pending.Container.RecognizedBy;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class RecognizedByDeserializer implements JsonDeserializer<RecognizedBy> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public RecognizedBy deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new RECOGNIZED_BY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new RECOGNIZED_BY(), RecognizedBy.class, RECOGNIZED_BY.class, fldMap);
	}

}
