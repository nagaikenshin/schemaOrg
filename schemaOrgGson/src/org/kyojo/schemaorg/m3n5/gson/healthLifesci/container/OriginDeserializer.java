package org.kyojo.schemaorg.m3n5.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.ORIGIN;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.Origin;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class OriginDeserializer implements JsonDeserializer<Origin> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Origin deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ORIGIN(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ORIGIN(), Origin.class, ORIGIN.class, fldMap);
	}

}
