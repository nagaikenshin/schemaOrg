package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.BANK_ACCOUNT;
import org.kyojo.schemaorg.m3n4.core.Clazz.BankAccount;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class BankAccountDeserializer implements JsonDeserializer<BankAccount> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public BankAccount deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new BANK_ACCOUNT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new BANK_ACCOUNT(), BankAccount.class, BANK_ACCOUNT.class, fldMap);
	}

}
