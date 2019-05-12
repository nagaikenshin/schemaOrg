package org.kyojo.schemaorg.m3n5.gson.auto.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.auto.impl.EMISSIONS_CO2;
import org.kyojo.schemaorg.m3n5.auto.Container.EmissionsCO2;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class EmissionsCO2Deserializer implements JsonDeserializer<EmissionsCO2> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public EmissionsCO2 deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new EMISSIONS_CO2(jsonElement.getAsBigDecimal());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new EMISSIONS_CO2(), EmissionsCO2.class, EMISSIONS_CO2.class, fldMap);
	}

}