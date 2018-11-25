package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.SALARY_CURRENCY;
import org.kyojo.schemaorg.m3n4.core.Container.SalaryCurrency;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class SalaryCurrencyDeserializer implements JsonDeserializer<SalaryCurrency> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SalaryCurrency deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SALARY_CURRENCY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SALARY_CURRENCY(), SalaryCurrency.class, SALARY_CURRENCY.class, fldMap);
	}

}
