package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.POSTAL_CODE;
import org.kyojo.schemaorg.m3n5.core.Container.PostalCode;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class PostalCodeDeserializer implements JsonDeserializer<PostalCode> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PostalCode deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new POSTAL_CODE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new POSTAL_CODE(), PostalCode.class, POSTAL_CODE.class, fldMap);
	}

}
