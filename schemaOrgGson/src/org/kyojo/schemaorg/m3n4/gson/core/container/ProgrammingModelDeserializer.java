package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.PROGRAMMING_MODEL;
import org.kyojo.schemaorg.m3n4.core.Container.ProgrammingModel;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ProgrammingModelDeserializer implements JsonDeserializer<ProgrammingModel> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ProgrammingModel deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PROGRAMMING_MODEL(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PROGRAMMING_MODEL(), ProgrammingModel.class, PROGRAMMING_MODEL.class, fldMap);
	}

}
