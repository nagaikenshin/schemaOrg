package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.UNIT_PRICE_SPECIFICATION;
import org.kyojo.schemaorg.m3n5.core.Clazz.UnitPriceSpecification;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class UnitPriceSpecificationDeserializer implements JsonDeserializer<UnitPriceSpecification> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public UnitPriceSpecification deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new UNIT_PRICE_SPECIFICATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new UNIT_PRICE_SPECIFICATION(), UnitPriceSpecification.class, UNIT_PRICE_SPECIFICATION.class, fldMap);
	}

}
