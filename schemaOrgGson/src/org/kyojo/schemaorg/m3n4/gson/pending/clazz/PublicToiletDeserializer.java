package org.kyojo.schemaorg.m3n4.gson.pending.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.PUBLIC_TOILET;
import org.kyojo.schemaorg.m3n4.pending.Clazz.PublicToilet;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class PublicToiletDeserializer implements JsonDeserializer<PublicToilet> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PublicToilet deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PUBLIC_TOILET(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PUBLIC_TOILET(), PublicToilet.class, PUBLIC_TOILET.class, fldMap);
	}

}
