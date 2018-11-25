package org.kyojo.schemaorg.m3n4.gson.healthLifesci.physicalActivityCategory;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.physicalActivityCategory.BALANCE;
import org.kyojo.schemaorg.m3n4.healthLifesci.PhysicalActivityCategory.Balance;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class BalanceDeserializer implements JsonDeserializer<Balance> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Balance deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new BALANCE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new BALANCE(), Balance.class, BALANCE.class, fldMap);
	}

}
