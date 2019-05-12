package org.kyojo.schemaorg.m3n5.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.CASH_BACK;
import org.kyojo.schemaorg.m3n5.pending.Container.CashBack;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class CashBackDeserializer implements JsonDeserializer<CashBack> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CashBack deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CASH_BACK(jsonElement.getAsBigDecimal());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CASH_BACK(), CashBack.class, CASH_BACK.class, fldMap);
	}

}
