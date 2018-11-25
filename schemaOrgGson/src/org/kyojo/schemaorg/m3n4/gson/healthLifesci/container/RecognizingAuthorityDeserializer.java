package org.kyojo.schemaorg.m3n4.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.RECOGNIZING_AUTHORITY;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.RecognizingAuthority;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class RecognizingAuthorityDeserializer implements JsonDeserializer<RecognizingAuthority> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public RecognizingAuthority deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new RECOGNIZING_AUTHORITY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new RECOGNIZING_AUTHORITY(), RecognizingAuthority.class, RECOGNIZING_AUTHORITY.class, fldMap);
	}

}
