package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.SUCCESSOR_OF;
import org.kyojo.schemaorg.m3n5.core.Container.SuccessorOf;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class SuccessorOfDeserializer implements JsonDeserializer<SuccessorOf> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SuccessorOf deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SUCCESSOR_OF(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SUCCESSOR_OF(), SuccessorOf.class, SUCCESSOR_OF.class, fldMap);
	}

}
