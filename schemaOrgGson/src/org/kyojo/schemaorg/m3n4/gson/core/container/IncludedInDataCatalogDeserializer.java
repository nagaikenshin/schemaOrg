package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.INCLUDED_IN_DATA_CATALOG;
import org.kyojo.schemaorg.m3n4.core.Container.IncludedInDataCatalog;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class IncludedInDataCatalogDeserializer implements JsonDeserializer<IncludedInDataCatalog> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public IncludedInDataCatalog deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new INCLUDED_IN_DATA_CATALOG(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new INCLUDED_IN_DATA_CATALOG(), IncludedInDataCatalog.class, INCLUDED_IN_DATA_CATALOG.class, fldMap);
	}

}
