package org.kyojo.schemaorg.m3n4.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.LOAN_TYPE;
import org.kyojo.schemaorg.m3n4.pending.Container.LoanType;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class LoanTypeDeserializer implements JsonDeserializer<LoanType> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public LoanType deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new LOAN_TYPE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new LOAN_TYPE(), LoanType.class, LOAN_TYPE.class, fldMap);
	}

}
