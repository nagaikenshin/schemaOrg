package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.RECORDED_AS;
import org.kyojo.schemaorg.m3n5.core.Container.RecordedAs;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class RecordedAsDeserializer implements JsonDeserializer<RecordedAs> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public RecordedAs deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new RECORDED_AS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new RECORDED_AS(), RecordedAs.class, RECORDED_AS.class, fldMap);
	}

}
