package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.VALID_UNTIL;
import org.kyojo.schemaorg.m3n4.core.Container.ValidUntil;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ValidUntilDeserializer implements JsonDeserializer<ValidUntil> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ValidUntil deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			java.time.LocalDate date = context.deserialize(jsonElement, java.time.LocalDate.class);
			return new VALID_UNTIL(date);
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new VALID_UNTIL(), ValidUntil.class, VALID_UNTIL.class, fldMap);
	}

}
