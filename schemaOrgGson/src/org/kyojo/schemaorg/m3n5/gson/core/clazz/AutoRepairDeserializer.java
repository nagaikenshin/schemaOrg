package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.AUTO_REPAIR;
import org.kyojo.schemaorg.m3n5.core.Clazz.AutoRepair;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class AutoRepairDeserializer implements JsonDeserializer<AutoRepair> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AutoRepair deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new AUTO_REPAIR(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new AUTO_REPAIR(), AutoRepair.class, AUTO_REPAIR.class, fldMap);
	}

}