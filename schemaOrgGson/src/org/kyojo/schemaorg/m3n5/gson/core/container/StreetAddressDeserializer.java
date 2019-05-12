package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.STREET_ADDRESS;
import org.kyojo.schemaorg.m3n5.core.Container.StreetAddress;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class StreetAddressDeserializer implements JsonDeserializer<StreetAddress> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public StreetAddress deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new STREET_ADDRESS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new STREET_ADDRESS(), StreetAddress.class, STREET_ADDRESS.class, fldMap);
	}

}
