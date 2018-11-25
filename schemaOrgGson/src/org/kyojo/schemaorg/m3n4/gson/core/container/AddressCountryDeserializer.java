package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.ADDRESS_COUNTRY;
import org.kyojo.schemaorg.m3n4.core.Container.AddressCountry;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class AddressCountryDeserializer implements JsonDeserializer<AddressCountry> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AddressCountry deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ADDRESS_COUNTRY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ADDRESS_COUNTRY(), AddressCountry.class, ADDRESS_COUNTRY.class, fldMap);
	}

}
