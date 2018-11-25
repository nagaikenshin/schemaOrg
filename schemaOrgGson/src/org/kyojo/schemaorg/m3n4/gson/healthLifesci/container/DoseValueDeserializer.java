package org.kyojo.schemaorg.m3n4.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.DOSE_VALUE;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.DoseValue;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class DoseValueDeserializer implements JsonDeserializer<DoseValue> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DoseValue deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DOSE_VALUE(jsonElement.getAsBigDecimal());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DOSE_VALUE(), DoseValue.class, DOSE_VALUE.class, fldMap);
	}

}
