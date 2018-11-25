package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.AMOUNT_OF_THIS_GOOD;
import org.kyojo.schemaorg.m3n4.core.Container.AmountOfThisGood;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class AmountOfThisGoodDeserializer implements JsonDeserializer<AmountOfThisGood> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AmountOfThisGood deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new AMOUNT_OF_THIS_GOOD(jsonElement.getAsBigDecimal());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new AMOUNT_OF_THIS_GOOD(), AmountOfThisGood.class, AMOUNT_OF_THIS_GOOD.class, fldMap);
	}

}
