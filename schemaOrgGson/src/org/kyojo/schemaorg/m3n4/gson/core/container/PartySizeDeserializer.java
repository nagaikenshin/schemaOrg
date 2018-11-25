package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.PARTY_SIZE;
import org.kyojo.schemaorg.m3n4.core.Container.PartySize;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class PartySizeDeserializer implements JsonDeserializer<PartySize> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PartySize deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			try {
				return new PARTY_SIZE(jsonElement.getAsLong());
			} catch(NumberFormatException nfe) {
				return null;
			}
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PARTY_SIZE(), PartySize.class, PARTY_SIZE.class, fldMap);
	}

}
