package org.kyojo.schemaorg.m3n5.gson.pending.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.MONEY_TRANSFER;
import org.kyojo.schemaorg.m3n5.pending.Clazz.MoneyTransfer;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class MoneyTransferDeserializer implements JsonDeserializer<MoneyTransfer> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MoneyTransfer deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MONEY_TRANSFER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MONEY_TRANSFER(), MoneyTransfer.class, MONEY_TRANSFER.class, fldMap);
	}

}
