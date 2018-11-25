package org.kyojo.schemaorg.m3n4.gson.pending.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.BROKERAGE_ACCOUNT;
import org.kyojo.schemaorg.m3n4.pending.Clazz.BrokerageAccount;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class BrokerageAccountDeserializer implements JsonDeserializer<BrokerageAccount> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public BrokerageAccount deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new BROKERAGE_ACCOUNT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new BROKERAGE_ACCOUNT(), BrokerageAccount.class, BROKERAGE_ACCOUNT.class, fldMap);
	}

}
