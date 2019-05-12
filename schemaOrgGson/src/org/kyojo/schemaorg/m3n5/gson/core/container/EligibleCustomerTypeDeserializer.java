package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.ELIGIBLE_CUSTOMER_TYPE;
import org.kyojo.schemaorg.m3n5.core.Container.EligibleCustomerType;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class EligibleCustomerTypeDeserializer implements JsonDeserializer<EligibleCustomerType> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public EligibleCustomerType deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ELIGIBLE_CUSTOMER_TYPE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ELIGIBLE_CUSTOMER_TYPE(), EligibleCustomerType.class, ELIGIBLE_CUSTOMER_TYPE.class, fldMap);
	}

}
