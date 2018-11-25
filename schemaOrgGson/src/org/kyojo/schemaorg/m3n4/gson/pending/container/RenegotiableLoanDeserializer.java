package org.kyojo.schemaorg.m3n4.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.RENEGOTIABLE_LOAN;
import org.kyojo.schemaorg.m3n4.pending.Container.RenegotiableLoan;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class RenegotiableLoanDeserializer implements JsonDeserializer<RenegotiableLoan> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public RenegotiableLoan deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new RENEGOTIABLE_LOAN(jsonElement.getAsBoolean());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new RENEGOTIABLE_LOAN(), RenegotiableLoan.class, RENEGOTIABLE_LOAN.class, fldMap);
	}

}
