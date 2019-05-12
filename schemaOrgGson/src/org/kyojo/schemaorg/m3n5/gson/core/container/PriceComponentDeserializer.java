package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.PRICE_COMPONENT;
import org.kyojo.schemaorg.m3n5.core.Container.PriceComponent;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class PriceComponentDeserializer implements JsonDeserializer<PriceComponent> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PriceComponent deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PRICE_COMPONENT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PRICE_COMPONENT(), PriceComponent.class, PRICE_COMPONENT.class, fldMap);
	}

}