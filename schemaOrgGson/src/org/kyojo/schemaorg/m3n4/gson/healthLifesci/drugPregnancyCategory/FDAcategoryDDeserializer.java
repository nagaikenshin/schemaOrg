package org.kyojo.schemaorg.m3n4.gson.healthLifesci.drugPregnancyCategory;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.drugPregnancyCategory.FDA_CATEGORY_D;
import org.kyojo.schemaorg.m3n4.healthLifesci.DrugPregnancyCategory.FDAcategoryD;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class FDAcategoryDDeserializer implements JsonDeserializer<FDAcategoryD> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public FDAcategoryD deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new FDA_CATEGORY_D(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new FDA_CATEGORY_D(), FDAcategoryD.class, FDA_CATEGORY_D.class, fldMap);
	}

}
