package org.kyojo.schemaorg.m3n5.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.COST_PER_UNIT;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.CostPerUnit;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class CostPerUnitDeserializer implements JsonDeserializer<CostPerUnit> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CostPerUnit deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new COST_PER_UNIT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new COST_PER_UNIT(), CostPerUnit.class, COST_PER_UNIT.class, fldMap);
	}

}
