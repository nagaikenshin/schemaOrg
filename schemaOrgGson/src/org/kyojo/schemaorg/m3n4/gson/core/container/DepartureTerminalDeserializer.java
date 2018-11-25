package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.DEPARTURE_TERMINAL;
import org.kyojo.schemaorg.m3n4.core.Container.DepartureTerminal;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class DepartureTerminalDeserializer implements JsonDeserializer<DepartureTerminal> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DepartureTerminal deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DEPARTURE_TERMINAL(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DEPARTURE_TERMINAL(), DepartureTerminal.class, DEPARTURE_TERMINAL.class, fldMap);
	}

}
