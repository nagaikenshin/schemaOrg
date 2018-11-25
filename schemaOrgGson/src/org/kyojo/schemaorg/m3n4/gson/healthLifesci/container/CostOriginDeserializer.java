package org.kyojo.schemaorg.m3n4.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.COST_ORIGIN;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.CostOrigin;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class CostOriginDeserializer implements JsonDeserializer<CostOrigin> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CostOrigin deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new COST_ORIGIN(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new COST_ORIGIN(), CostOrigin.class, COST_ORIGIN.class, fldMap);
	}

}
