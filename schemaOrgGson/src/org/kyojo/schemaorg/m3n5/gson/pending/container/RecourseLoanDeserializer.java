package org.kyojo.schemaorg.m3n5.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.RECOURSE_LOAN;
import org.kyojo.schemaorg.m3n5.pending.Container.RecourseLoan;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class RecourseLoanDeserializer implements JsonDeserializer<RecourseLoan> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public RecourseLoan deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new RECOURSE_LOAN(jsonElement.getAsBoolean());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new RECOURSE_LOAN(), RecourseLoan.class, RECOURSE_LOAN.class, fldMap);
	}

}
