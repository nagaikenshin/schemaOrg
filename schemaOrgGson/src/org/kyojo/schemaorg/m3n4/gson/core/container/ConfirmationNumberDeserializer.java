package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.CONFIRMATION_NUMBER;
import org.kyojo.schemaorg.m3n4.core.Container.ConfirmationNumber;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ConfirmationNumberDeserializer implements JsonDeserializer<ConfirmationNumber> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ConfirmationNumber deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CONFIRMATION_NUMBER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CONFIRMATION_NUMBER(), ConfirmationNumber.class, CONFIRMATION_NUMBER.class, fldMap);
	}

}
