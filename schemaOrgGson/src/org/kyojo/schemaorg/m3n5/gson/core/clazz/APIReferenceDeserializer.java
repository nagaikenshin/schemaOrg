package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.API_REFERENCE;
import org.kyojo.schemaorg.m3n5.core.Clazz.APIReference;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class APIReferenceDeserializer implements JsonDeserializer<APIReference> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public APIReference deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new API_REFERENCE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new API_REFERENCE(), APIReference.class, API_REFERENCE.class, fldMap);
	}

}
