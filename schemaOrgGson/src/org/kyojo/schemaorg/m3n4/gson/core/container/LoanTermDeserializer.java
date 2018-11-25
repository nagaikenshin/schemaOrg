package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.LOAN_TERM;
import org.kyojo.schemaorg.m3n4.core.Container.LoanTerm;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class LoanTermDeserializer implements JsonDeserializer<LoanTerm> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public LoanTerm deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new LOAN_TERM(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new LOAN_TERM(), LoanTerm.class, LOAN_TERM.class, fldMap);
	}

}
