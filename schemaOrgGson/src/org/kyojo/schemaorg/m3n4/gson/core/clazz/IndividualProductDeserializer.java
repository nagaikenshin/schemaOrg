package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.INDIVIDUAL_PRODUCT;
import org.kyojo.schemaorg.m3n4.core.Clazz.IndividualProduct;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class IndividualProductDeserializer implements JsonDeserializer<IndividualProduct> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public IndividualProduct deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new INDIVIDUAL_PRODUCT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new INDIVIDUAL_PRODUCT(), IndividualProduct.class, INDIVIDUAL_PRODUCT.class, fldMap);
	}

}
