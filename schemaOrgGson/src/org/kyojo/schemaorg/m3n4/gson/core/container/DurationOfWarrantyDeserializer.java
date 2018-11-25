package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.DURATION_OF_WARRANTY;
import org.kyojo.schemaorg.m3n4.core.Container.DurationOfWarranty;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class DurationOfWarrantyDeserializer implements JsonDeserializer<DurationOfWarranty> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DurationOfWarranty deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DURATION_OF_WARRANTY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DURATION_OF_WARRANTY(), DurationOfWarranty.class, DURATION_OF_WARRANTY.class, fldMap);
	}

}
