package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.FUEL_EFFICIENCY;
import org.kyojo.schemaorg.m3n5.core.Container.FuelEfficiency;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class FuelEfficiencyDeserializer implements JsonDeserializer<FuelEfficiency> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public FuelEfficiency deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new FUEL_EFFICIENCY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new FUEL_EFFICIENCY(), FuelEfficiency.class, FUEL_EFFICIENCY.class, fldMap);
	}

}
