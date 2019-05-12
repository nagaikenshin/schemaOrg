package org.kyojo.schemaorg.m3n5.gson.healthLifesci.drugPregnancyCategory;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.drugPregnancyCategory.FDA_CATEGORY_B;
import org.kyojo.schemaorg.m3n5.healthLifesci.DrugPregnancyCategory.FDAcategoryB;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class FDAcategoryBDeserializer implements JsonDeserializer<FDAcategoryB> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public FDAcategoryB deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new FDA_CATEGORY_B(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new FDA_CATEGORY_B(), FDAcategoryB.class, FDA_CATEGORY_B.class, fldMap);
	}

}
