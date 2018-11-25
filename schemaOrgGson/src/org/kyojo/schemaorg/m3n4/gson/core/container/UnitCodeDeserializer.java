package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.UNIT_CODE;
import org.kyojo.schemaorg.m3n4.core.Container.UnitCode;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class UnitCodeDeserializer implements JsonDeserializer<UnitCode> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public UnitCode deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new UNIT_CODE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new UNIT_CODE(), UnitCode.class, UNIT_CODE.class, fldMap);
	}

}
