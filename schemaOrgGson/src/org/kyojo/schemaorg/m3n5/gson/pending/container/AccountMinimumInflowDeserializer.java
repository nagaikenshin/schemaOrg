package org.kyojo.schemaorg.m3n5.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.ACCOUNT_MINIMUM_INFLOW;
import org.kyojo.schemaorg.m3n5.pending.Container.AccountMinimumInflow;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class AccountMinimumInflowDeserializer implements JsonDeserializer<AccountMinimumInflow> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AccountMinimumInflow deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ACCOUNT_MINIMUM_INFLOW(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ACCOUNT_MINIMUM_INFLOW(), AccountMinimumInflow.class, ACCOUNT_MINIMUM_INFLOW.class, fldMap);
	}

}
