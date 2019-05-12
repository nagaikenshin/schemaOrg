package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.GTIN12;
import org.kyojo.schemaorg.m3n5.core.Container.Gtin12;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class Gtin12Deserializer implements JsonDeserializer<Gtin12> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Gtin12 deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new GTIN12(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new GTIN12(), Gtin12.class, GTIN12.class, fldMap);
	}

}
