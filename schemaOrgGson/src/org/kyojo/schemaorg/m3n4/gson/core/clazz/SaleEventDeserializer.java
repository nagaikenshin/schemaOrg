package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.SALE_EVENT;
import org.kyojo.schemaorg.m3n4.core.Clazz.SaleEvent;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class SaleEventDeserializer implements JsonDeserializer<SaleEvent> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SaleEvent deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SALE_EVENT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SALE_EVENT(), SaleEvent.class, SALE_EVENT.class, fldMap);
	}

}
