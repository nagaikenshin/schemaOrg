package org.kyojo.schemaorg.m3n5.gson.pending.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.MORTGAGE_LOAN;
import org.kyojo.schemaorg.m3n5.pending.Clazz.MortgageLoan;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class MortgageLoanDeserializer implements JsonDeserializer<MortgageLoan> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MortgageLoan deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MORTGAGE_LOAN(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MORTGAGE_LOAN(), MortgageLoan.class, MORTGAGE_LOAN.class, fldMap);
	}

}
