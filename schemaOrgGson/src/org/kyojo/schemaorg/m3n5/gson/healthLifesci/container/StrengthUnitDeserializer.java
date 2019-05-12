package org.kyojo.schemaorg.m3n5.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.STRENGTH_UNIT;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.StrengthUnit;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class StrengthUnitDeserializer implements JsonDeserializer<StrengthUnit> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public StrengthUnit deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new STRENGTH_UNIT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new STRENGTH_UNIT(), StrengthUnit.class, STRENGTH_UNIT.class, fldMap);
	}

}
