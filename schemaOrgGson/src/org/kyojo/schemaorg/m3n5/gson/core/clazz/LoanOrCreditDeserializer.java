package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.LOAN_OR_CREDIT;
import org.kyojo.schemaorg.m3n5.core.Clazz.LoanOrCredit;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class LoanOrCreditDeserializer implements JsonDeserializer<LoanOrCredit> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public LoanOrCredit deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new LOAN_OR_CREDIT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new LOAN_OR_CREDIT(), LoanOrCredit.class, LOAN_OR_CREDIT.class, fldMap);
	}

}
