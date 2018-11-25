package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.BUS_NUMBER;
import org.kyojo.schemaorg.m3n4.core.Container.BusNumber;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class BusNumberDeserializer implements JsonDeserializer<BusNumber> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public BusNumber deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new BUS_NUMBER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new BUS_NUMBER(), BusNumber.class, BUS_NUMBER.class, fldMap);
	}

}
