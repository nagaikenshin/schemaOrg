package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.EXAMPLE_OF_WORK;
import org.kyojo.schemaorg.m3n5.core.Container.ExampleOfWork;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ExampleOfWorkDeserializer implements JsonDeserializer<ExampleOfWork> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ExampleOfWork deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new EXAMPLE_OF_WORK(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new EXAMPLE_OF_WORK(), ExampleOfWork.class, EXAMPLE_OF_WORK.class, fldMap);
	}

}
