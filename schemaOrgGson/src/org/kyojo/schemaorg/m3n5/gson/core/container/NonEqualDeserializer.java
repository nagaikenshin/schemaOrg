package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.NON_EQUAL;
import org.kyojo.schemaorg.m3n5.core.Container.NonEqual;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class NonEqualDeserializer implements JsonDeserializer<NonEqual> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public NonEqual deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new NON_EQUAL(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new NON_EQUAL(), NonEqual.class, NON_EQUAL.class, fldMap);
	}

}
