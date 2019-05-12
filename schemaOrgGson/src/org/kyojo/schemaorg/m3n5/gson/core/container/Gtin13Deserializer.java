package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.GTIN13;
import org.kyojo.schemaorg.m3n5.core.Container.Gtin13;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class Gtin13Deserializer implements JsonDeserializer<Gtin13> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Gtin13 deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new GTIN13(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new GTIN13(), Gtin13.class, GTIN13.class, fldMap);
	}

}
