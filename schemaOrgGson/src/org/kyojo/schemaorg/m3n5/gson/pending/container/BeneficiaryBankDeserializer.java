package org.kyojo.schemaorg.m3n5.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.BENEFICIARY_BANK;
import org.kyojo.schemaorg.m3n5.pending.Container.BeneficiaryBank;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class BeneficiaryBankDeserializer implements JsonDeserializer<BeneficiaryBank> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public BeneficiaryBank deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new BENEFICIARY_BANK(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new BENEFICIARY_BANK(), BeneficiaryBank.class, BENEFICIARY_BANK.class, fldMap);
	}

}
