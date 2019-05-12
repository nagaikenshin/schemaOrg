package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.COMPOUND_PRICE_SPECIFICATION;
import org.kyojo.schemaorg.m3n5.core.Clazz.CompoundPriceSpecification;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class CompoundPriceSpecificationDeserializer implements JsonDeserializer<CompoundPriceSpecification> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CompoundPriceSpecification deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new COMPOUND_PRICE_SPECIFICATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new COMPOUND_PRICE_SPECIFICATION(), CompoundPriceSpecification.class, COMPOUND_PRICE_SPECIFICATION.class, fldMap);
	}

}
