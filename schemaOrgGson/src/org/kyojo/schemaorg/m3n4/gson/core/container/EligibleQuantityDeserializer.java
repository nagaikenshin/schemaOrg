package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.ELIGIBLE_QUANTITY;
import org.kyojo.schemaorg.m3n4.core.Container.EligibleQuantity;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class EligibleQuantityDeserializer implements JsonDeserializer<EligibleQuantity> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public EligibleQuantity deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ELIGIBLE_QUANTITY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ELIGIBLE_QUANTITY(), EligibleQuantity.class, ELIGIBLE_QUANTITY.class, fldMap);
	}

}
