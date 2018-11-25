package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.VAT_ID;
import org.kyojo.schemaorg.m3n4.core.Container.VatID;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class VatIDDeserializer implements JsonDeserializer<VatID> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public VatID deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new VAT_ID(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new VAT_ID(), VatID.class, VAT_ID.class, fldMap);
	}

}
