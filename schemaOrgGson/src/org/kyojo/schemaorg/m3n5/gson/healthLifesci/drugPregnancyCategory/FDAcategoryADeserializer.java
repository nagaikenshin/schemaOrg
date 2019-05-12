package org.kyojo.schemaorg.m3n5.gson.healthLifesci.drugPregnancyCategory;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.drugPregnancyCategory.FDA_CATEGORY_A;
import org.kyojo.schemaorg.m3n5.healthLifesci.DrugPregnancyCategory.FDAcategoryA;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class FDAcategoryADeserializer implements JsonDeserializer<FDAcategoryA> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public FDAcategoryA deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new FDA_CATEGORY_A(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new FDA_CATEGORY_A(), FDAcategoryA.class, FDA_CATEGORY_A.class, fldMap);
	}

}
