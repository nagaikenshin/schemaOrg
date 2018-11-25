package org.kyojo.schemaorg.m3n4.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.PREGNANCY_CATEGORY;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.PregnancyCategory;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class PregnancyCategoryDeserializer implements JsonDeserializer<PregnancyCategory> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PregnancyCategory deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PREGNANCY_CATEGORY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PREGNANCY_CATEGORY(), PregnancyCategory.class, PREGNANCY_CATEGORY.class, fldMap);
	}

}
