package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.ADDRESS_LOCALITY;
import org.kyojo.schemaorg.m3n5.core.Container.AddressLocality;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class AddressLocalityDeserializer implements JsonDeserializer<AddressLocality> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AddressLocality deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ADDRESS_LOCALITY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ADDRESS_LOCALITY(), AddressLocality.class, ADDRESS_LOCALITY.class, fldMap);
	}

}