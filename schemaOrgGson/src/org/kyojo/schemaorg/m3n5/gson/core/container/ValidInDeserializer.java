package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.VALID_IN;
import org.kyojo.schemaorg.m3n5.core.Container.ValidIn;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ValidInDeserializer implements JsonDeserializer<ValidIn> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ValidIn deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new VALID_IN(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new VALID_IN(), ValidIn.class, VALID_IN.class, fldMap);
	}

}
