package org.kyojo.schemaorg.m3n5.gson.healthLifesci.drugCostCategory;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.drugCostCategory.RETAIL;
import org.kyojo.schemaorg.m3n5.healthLifesci.DrugCostCategory.Retail;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class RetailDeserializer implements JsonDeserializer<Retail> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Retail deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new RETAIL(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new RETAIL(), Retail.class, RETAIL.class, fldMap);
	}

}
