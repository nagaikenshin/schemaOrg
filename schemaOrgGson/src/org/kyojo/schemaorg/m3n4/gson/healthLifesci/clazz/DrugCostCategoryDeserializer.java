package org.kyojo.schemaorg.m3n4.gson.healthLifesci.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.DRUG_COST_CATEGORY;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.DrugCostCategory;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class DrugCostCategoryDeserializer implements JsonDeserializer<DrugCostCategory> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DrugCostCategory deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DRUG_COST_CATEGORY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DRUG_COST_CATEGORY(), DrugCostCategory.class, DRUG_COST_CATEGORY.class, fldMap);
	}

}
