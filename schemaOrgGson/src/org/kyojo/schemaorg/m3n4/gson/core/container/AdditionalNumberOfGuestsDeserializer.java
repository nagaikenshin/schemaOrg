package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.ADDITIONAL_NUMBER_OF_GUESTS;
import org.kyojo.schemaorg.m3n4.core.Container.AdditionalNumberOfGuests;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class AdditionalNumberOfGuestsDeserializer implements JsonDeserializer<AdditionalNumberOfGuests> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AdditionalNumberOfGuests deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ADDITIONAL_NUMBER_OF_GUESTS(jsonElement.getAsBigDecimal());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ADDITIONAL_NUMBER_OF_GUESTS(), AdditionalNumberOfGuests.class, ADDITIONAL_NUMBER_OF_GUESTS.class, fldMap);
	}

}
