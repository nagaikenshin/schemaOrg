package org.kyojo.schemaorg.m3n5.gson.core.offerItemCondition;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.offerItemCondition.USED_CONDITION;
import org.kyojo.schemaorg.m3n5.core.OfferItemCondition.UsedCondition;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class UsedConditionDeserializer implements JsonDeserializer<UsedCondition> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public UsedCondition deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new USED_CONDITION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new USED_CONDITION(), UsedCondition.class, USED_CONDITION.class, fldMap);
	}

}
