package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.PRODUCTION_DATE;
import org.kyojo.schemaorg.m3n5.core.Container.ProductionDate;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ProductionDateDeserializer implements JsonDeserializer<ProductionDate> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ProductionDate deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			java.time.LocalDate date = context.deserialize(jsonElement, java.time.LocalDate.class);
			return new PRODUCTION_DATE(date);
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PRODUCTION_DATE(), ProductionDate.class, PRODUCTION_DATE.class, fldMap);
	}

}
