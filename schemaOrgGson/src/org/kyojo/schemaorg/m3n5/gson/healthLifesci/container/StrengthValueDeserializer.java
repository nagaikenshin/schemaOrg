package org.kyojo.schemaorg.m3n5.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.STRENGTH_VALUE;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.StrengthValue;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class StrengthValueDeserializer implements JsonDeserializer<StrengthValue> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public StrengthValue deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new STRENGTH_VALUE(jsonElement.getAsBigDecimal());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new STRENGTH_VALUE(), StrengthValue.class, STRENGTH_VALUE.class, fldMap);
	}

}
