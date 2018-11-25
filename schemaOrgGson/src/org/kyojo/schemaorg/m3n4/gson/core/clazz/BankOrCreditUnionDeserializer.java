package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.BANK_OR_CREDIT_UNION;
import org.kyojo.schemaorg.m3n4.core.Clazz.BankOrCreditUnion;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class BankOrCreditUnionDeserializer implements JsonDeserializer<BankOrCreditUnion> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public BankOrCreditUnion deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new BANK_OR_CREDIT_UNION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new BANK_OR_CREDIT_UNION(), BankOrCreditUnion.class, BANK_OR_CREDIT_UNION.class, fldMap);
	}

}
