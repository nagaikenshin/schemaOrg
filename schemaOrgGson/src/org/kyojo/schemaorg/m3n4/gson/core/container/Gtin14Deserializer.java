package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.GTIN14;
import org.kyojo.schemaorg.m3n4.core.Container.Gtin14;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class Gtin14Deserializer implements JsonDeserializer<Gtin14> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Gtin14 deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new GTIN14(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new GTIN14(), Gtin14.class, GTIN14.class, fldMap);
	}

}
