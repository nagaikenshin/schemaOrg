package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.REFERENCE_QUANTITY;
import org.kyojo.schemaorg.m3n4.core.Container.ReferenceQuantity;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ReferenceQuantityDeserializer implements JsonDeserializer<ReferenceQuantity> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ReferenceQuantity deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new REFERENCE_QUANTITY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new REFERENCE_QUANTITY(), ReferenceQuantity.class, REFERENCE_QUANTITY.class, fldMap);
	}

}
