package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.MOTORCYCLE_REPAIR;
import org.kyojo.schemaorg.m3n5.core.Clazz.MotorcycleRepair;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class MotorcycleRepairDeserializer implements JsonDeserializer<MotorcycleRepair> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MotorcycleRepair deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MOTORCYCLE_REPAIR(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MOTORCYCLE_REPAIR(), MotorcycleRepair.class, MOTORCYCLE_REPAIR.class, fldMap);
	}

}
