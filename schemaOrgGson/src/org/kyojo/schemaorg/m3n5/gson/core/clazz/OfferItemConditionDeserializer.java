package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.OFFER_ITEM_CONDITION;
import org.kyojo.schemaorg.m3n5.core.Clazz.OfferItemCondition;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class OfferItemConditionDeserializer implements JsonDeserializer<OfferItemCondition> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public OfferItemCondition deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new OFFER_ITEM_CONDITION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new OFFER_ITEM_CONDITION(), OfferItemCondition.class, OFFER_ITEM_CONDITION.class, fldMap);
	}

}
