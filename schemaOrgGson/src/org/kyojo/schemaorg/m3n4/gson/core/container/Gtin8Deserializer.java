package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.GTIN8;
import org.kyojo.schemaorg.m3n4.core.Container.Gtin8;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class Gtin8Deserializer implements JsonDeserializer<Gtin8> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Gtin8 deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new GTIN8(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new GTIN8(), Gtin8.class, GTIN8.class, fldMap);
	}

}
