package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.RESULT;
import org.kyojo.schemaorg.m3n5.core.Container.Result;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ResultDeserializer implements JsonDeserializer<Result> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Result deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new RESULT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new RESULT(), Result.class, RESULT.class, fldMap);
	}

}
