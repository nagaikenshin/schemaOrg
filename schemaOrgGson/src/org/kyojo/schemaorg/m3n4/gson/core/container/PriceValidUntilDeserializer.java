package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.PRICE_VALID_UNTIL;
import org.kyojo.schemaorg.m3n4.core.Container.PriceValidUntil;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class PriceValidUntilDeserializer implements JsonDeserializer<PriceValidUntil> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PriceValidUntil deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			java.time.LocalDate date = context.deserialize(jsonElement, java.time.LocalDate.class);
			return new PRICE_VALID_UNTIL(date);
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PRICE_VALID_UNTIL(), PriceValidUntil.class, PRICE_VALID_UNTIL.class, fldMap);
	}

}
