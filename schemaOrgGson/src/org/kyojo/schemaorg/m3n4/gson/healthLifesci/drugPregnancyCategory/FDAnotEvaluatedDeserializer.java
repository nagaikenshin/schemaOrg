package org.kyojo.schemaorg.m3n4.gson.healthLifesci.drugPregnancyCategory;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.drugPregnancyCategory.FDA_NOT_EVALUATED;
import org.kyojo.schemaorg.m3n4.healthLifesci.DrugPregnancyCategory.FDAnotEvaluated;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class FDAnotEvaluatedDeserializer implements JsonDeserializer<FDAnotEvaluated> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public FDAnotEvaluated deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new FDA_NOT_EVALUATED(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new FDA_NOT_EVALUATED(), FDAnotEvaluated.class, FDA_NOT_EVALUATED.class, fldMap);
	}

}
