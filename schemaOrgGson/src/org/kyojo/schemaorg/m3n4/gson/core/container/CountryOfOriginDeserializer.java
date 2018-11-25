package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.COUNTRY_OF_ORIGIN;
import org.kyojo.schemaorg.m3n4.core.Container.CountryOfOrigin;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class CountryOfOriginDeserializer implements JsonDeserializer<CountryOfOrigin> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CountryOfOrigin deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new COUNTRY_OF_ORIGIN(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new COUNTRY_OF_ORIGIN(), CountryOfOrigin.class, COUNTRY_OF_ORIGIN.class, fldMap);
	}

}
