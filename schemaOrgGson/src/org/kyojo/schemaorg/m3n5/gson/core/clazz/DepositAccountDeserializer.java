package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.DEPOSIT_ACCOUNT;
import org.kyojo.schemaorg.m3n5.core.Clazz.DepositAccount;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class DepositAccountDeserializer implements JsonDeserializer<DepositAccount> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DepositAccount deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DEPOSIT_ACCOUNT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DEPOSIT_ACCOUNT(), DepositAccount.class, DEPOSIT_ACCOUNT.class, fldMap);
	}

}