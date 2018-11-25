package org.kyojo.schemaorg.m3n4.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.BANK_ACCOUNT_TYPE;
import org.kyojo.schemaorg.m3n4.pending.Container.BankAccountType;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class BankAccountTypeDeserializer implements JsonDeserializer<BankAccountType> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public BankAccountType deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new BANK_ACCOUNT_TYPE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new BANK_ACCOUNT_TYPE(), BankAccountType.class, BANK_ACCOUNT_TYPE.class, fldMap);
	}

}
