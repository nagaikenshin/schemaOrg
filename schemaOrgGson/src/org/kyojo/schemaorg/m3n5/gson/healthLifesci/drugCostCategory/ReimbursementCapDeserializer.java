package org.kyojo.schemaorg.m3n5.gson.healthLifesci.drugCostCategory;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.drugCostCategory.REIMBURSEMENT_CAP;
import org.kyojo.schemaorg.m3n5.healthLifesci.DrugCostCategory.ReimbursementCap;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ReimbursementCapDeserializer implements JsonDeserializer<ReimbursementCap> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ReimbursementCap deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new REIMBURSEMENT_CAP(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new REIMBURSEMENT_CAP(), ReimbursementCap.class, REIMBURSEMENT_CAP.class, fldMap);
	}

}
