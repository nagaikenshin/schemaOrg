package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.REQUIRED_QUANTITY;
import org.kyojo.schemaorg.m3n5.core.Container.RequiredQuantity;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class RequiredQuantityDeserializer implements JsonDeserializer<RequiredQuantity> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public RequiredQuantity deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new REQUIRED_QUANTITY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new REQUIRED_QUANTITY(), RequiredQuantity.class, REQUIRED_QUANTITY.class, fldMap);
	}

}