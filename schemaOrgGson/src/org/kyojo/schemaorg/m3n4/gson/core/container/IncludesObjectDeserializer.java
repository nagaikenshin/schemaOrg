package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.INCLUDES_OBJECT;
import org.kyojo.schemaorg.m3n4.core.Container.IncludesObject;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class IncludesObjectDeserializer implements JsonDeserializer<IncludesObject> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public IncludesObject deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new INCLUDES_OBJECT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new INCLUDES_OBJECT(), IncludesObject.class, INCLUDES_OBJECT.class, fldMap);
	}

}
