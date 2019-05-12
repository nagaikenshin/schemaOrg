package org.kyojo.schemaorg.m3n5.gson.core.offerItemCondition;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.offerItemCondition.REFURBISHED_CONDITION;
import org.kyojo.schemaorg.m3n5.core.OfferItemCondition.RefurbishedCondition;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class RefurbishedConditionDeserializer implements JsonDeserializer<RefurbishedCondition> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public RefurbishedCondition deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new REFURBISHED_CONDITION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new REFURBISHED_CONDITION(), RefurbishedCondition.class, REFURBISHED_CONDITION.class, fldMap);
	}

}
