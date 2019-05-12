package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.PART_OF_INVOICE;
import org.kyojo.schemaorg.m3n5.core.Container.PartOfInvoice;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class PartOfInvoiceDeserializer implements JsonDeserializer<PartOfInvoice> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PartOfInvoice deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PART_OF_INVOICE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PART_OF_INVOICE(), PartOfInvoice.class, PART_OF_INVOICE.class, fldMap);
	}

}
