package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.HAS_PART;
import org.kyojo.schemaorg.m3n5.core.Container.HasPart;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class HasPartDeserializer implements JsonDeserializer<HasPart> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public HasPart deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new HAS_PART(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new HAS_PART(), HasPart.class, HAS_PART.class, fldMap);
	}

}
