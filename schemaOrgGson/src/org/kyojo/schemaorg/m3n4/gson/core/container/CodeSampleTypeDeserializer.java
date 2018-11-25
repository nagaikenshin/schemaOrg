package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.CODE_SAMPLE_TYPE;
import org.kyojo.schemaorg.m3n4.core.Container.CodeSampleType;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class CodeSampleTypeDeserializer implements JsonDeserializer<CodeSampleType> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CodeSampleType deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CODE_SAMPLE_TYPE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CODE_SAMPLE_TYPE(), CodeSampleType.class, CODE_SAMPLE_TYPE.class, fldMap);
	}

}
