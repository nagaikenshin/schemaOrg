package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.ARRIVAL_GATE;
import org.kyojo.schemaorg.m3n5.core.Container.ArrivalGate;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ArrivalGateDeserializer implements JsonDeserializer<ArrivalGate> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ArrivalGate deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ARRIVAL_GATE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ARRIVAL_GATE(), ArrivalGate.class, ARRIVAL_GATE.class, fldMap);
	}

}
