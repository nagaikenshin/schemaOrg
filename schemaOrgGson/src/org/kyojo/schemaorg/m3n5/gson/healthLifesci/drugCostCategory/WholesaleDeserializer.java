package org.kyojo.schemaorg.m3n5.gson.healthLifesci.drugCostCategory;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.drugCostCategory.WHOLESALE;
import org.kyojo.schemaorg.m3n5.healthLifesci.DrugCostCategory.Wholesale;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class WholesaleDeserializer implements JsonDeserializer<Wholesale> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Wholesale deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new WHOLESALE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new WHOLESALE(), Wholesale.class, WHOLESALE.class, fldMap);
	}

}
