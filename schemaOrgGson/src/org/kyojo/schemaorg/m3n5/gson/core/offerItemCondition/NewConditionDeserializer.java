package org.kyojo.schemaorg.m3n5.gson.core.offerItemCondition;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.offerItemCondition.NEW_CONDITION;
import org.kyojo.schemaorg.m3n5.core.OfferItemCondition.NewCondition;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class NewConditionDeserializer implements JsonDeserializer<NewCondition> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public NewCondition deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new NEW_CONDITION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new NEW_CONDITION(), NewCondition.class, NEW_CONDITION.class, fldMap);
	}

}
