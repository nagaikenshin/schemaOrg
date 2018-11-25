package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.GLOBAL_LOCATION_NUMBER;
import org.kyojo.schemaorg.m3n4.core.Container.GlobalLocationNumber;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class GlobalLocationNumberDeserializer implements JsonDeserializer<GlobalLocationNumber> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public GlobalLocationNumber deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new GLOBAL_LOCATION_NUMBER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new GLOBAL_LOCATION_NUMBER(), GlobalLocationNumber.class, GLOBAL_LOCATION_NUMBER.class, fldMap);
	}

}
