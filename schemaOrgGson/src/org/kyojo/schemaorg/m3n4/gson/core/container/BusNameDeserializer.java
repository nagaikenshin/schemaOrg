package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.BUS_NAME;
import org.kyojo.schemaorg.m3n4.core.Container.BusName;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class BusNameDeserializer implements JsonDeserializer<BusName> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public BusName deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new BUS_NAME(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new BUS_NAME(), BusName.class, BUS_NAME.class, fldMap);
	}

}
