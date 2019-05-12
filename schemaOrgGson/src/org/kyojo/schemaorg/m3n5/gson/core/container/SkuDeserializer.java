package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.SKU;
import org.kyojo.schemaorg.m3n5.core.Container.Sku;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class SkuDeserializer implements JsonDeserializer<Sku> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Sku deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SKU(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SKU(), Sku.class, SKU.class, fldMap);
	}

}
