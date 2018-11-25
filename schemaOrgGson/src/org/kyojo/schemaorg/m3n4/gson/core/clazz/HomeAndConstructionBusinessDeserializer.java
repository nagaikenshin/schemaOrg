package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.HOME_AND_CONSTRUCTION_BUSINESS;
import org.kyojo.schemaorg.m3n4.core.Clazz.HomeAndConstructionBusiness;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class HomeAndConstructionBusinessDeserializer implements JsonDeserializer<HomeAndConstructionBusiness> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public HomeAndConstructionBusiness deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new HOME_AND_CONSTRUCTION_BUSINESS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new HOME_AND_CONSTRUCTION_BUSINESS(), HomeAndConstructionBusiness.class, HOME_AND_CONSTRUCTION_BUSINESS.class, fldMap);
	}

}
