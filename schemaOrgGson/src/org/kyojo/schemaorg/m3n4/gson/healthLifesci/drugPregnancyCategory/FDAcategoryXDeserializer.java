package org.kyojo.schemaorg.m3n4.gson.healthLifesci.drugPregnancyCategory;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.drugPregnancyCategory.FDA_CATEGORY_X;
import org.kyojo.schemaorg.m3n4.healthLifesci.DrugPregnancyCategory.FDAcategoryX;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class FDAcategoryXDeserializer implements JsonDeserializer<FDAcategoryX> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public FDAcategoryX deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new FDA_CATEGORY_X(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new FDA_CATEGORY_X(), FDAcategoryX.class, FDA_CATEGORY_X.class, fldMap);
	}

}
