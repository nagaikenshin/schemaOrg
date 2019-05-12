package org.kyojo.schemaorg.m3n5.gson.core.itemAvailability;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.itemAvailability.PRE_SALE;
import org.kyojo.schemaorg.m3n5.core.ItemAvailability.PreSale;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class PreSaleDeserializer implements JsonDeserializer<PreSale> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PreSale deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PRE_SALE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PRE_SALE(), PreSale.class, PRE_SALE.class, fldMap);
	}

}
