package org.kyojo.schemaorg.m3n5.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.ORIGINATES_FROM;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.OriginatesFrom;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class OriginatesFromDeserializer implements JsonDeserializer<OriginatesFrom> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public OriginatesFrom deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ORIGINATES_FROM(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ORIGINATES_FROM(), OriginatesFrom.class, ORIGINATES_FROM.class, fldMap);
	}

}
