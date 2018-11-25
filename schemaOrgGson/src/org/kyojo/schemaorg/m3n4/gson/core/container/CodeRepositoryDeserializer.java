package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.CODE_REPOSITORY;
import org.kyojo.schemaorg.m3n4.core.Container.CodeRepository;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class CodeRepositoryDeserializer implements JsonDeserializer<CodeRepository> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CodeRepository deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CODE_REPOSITORY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CODE_REPOSITORY(), CodeRepository.class, CODE_REPOSITORY.class, fldMap);
	}

}
