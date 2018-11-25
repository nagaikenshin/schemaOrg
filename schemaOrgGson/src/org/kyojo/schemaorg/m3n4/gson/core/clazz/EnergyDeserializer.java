package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.ENERGY;
import org.kyojo.schemaorg.m3n4.core.Clazz.Energy;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class EnergyDeserializer implements JsonDeserializer<Energy> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Energy deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ENERGY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ENERGY(), Energy.class, ENERGY.class, fldMap);
	}

}
