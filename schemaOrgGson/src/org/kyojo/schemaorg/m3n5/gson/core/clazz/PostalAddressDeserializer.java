package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.POSTAL_ADDRESS;
import org.kyojo.schemaorg.m3n5.core.Clazz.PostalAddress;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class PostalAddressDeserializer implements JsonDeserializer<PostalAddress> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PostalAddress deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new POSTAL_ADDRESS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new POSTAL_ADDRESS(), PostalAddress.class, POSTAL_ADDRESS.class, fldMap);
	}

}
