package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.HVAC_BUSINESS;
import org.kyojo.schemaorg.m3n5.core.Clazz.HVACBusiness;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class HVACBusinessDeserializer implements JsonDeserializer<HVACBusiness> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public HVACBusiness deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new HVAC_BUSINESS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new HVAC_BUSINESS(), HVACBusiness.class, HVAC_BUSINESS.class, fldMap);
	}

}
