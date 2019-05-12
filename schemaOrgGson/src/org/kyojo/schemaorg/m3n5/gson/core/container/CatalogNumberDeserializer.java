package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.CATALOG_NUMBER;
import org.kyojo.schemaorg.m3n5.core.Container.CatalogNumber;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class CatalogNumberDeserializer implements JsonDeserializer<CatalogNumber> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CatalogNumber deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CATALOG_NUMBER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CATALOG_NUMBER(), CatalogNumber.class, CATALOG_NUMBER.class, fldMap);
	}

}
