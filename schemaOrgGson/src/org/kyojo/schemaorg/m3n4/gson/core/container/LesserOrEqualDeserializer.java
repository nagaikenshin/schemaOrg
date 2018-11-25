package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.LESSER_OR_EQUAL;
import org.kyojo.schemaorg.m3n4.core.Container.LesserOrEqual;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class LesserOrEqualDeserializer implements JsonDeserializer<LesserOrEqual> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public LesserOrEqual deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new LESSER_OR_EQUAL(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new LESSER_OR_EQUAL(), LesserOrEqual.class, LESSER_OR_EQUAL.class, fldMap);
	}

}
