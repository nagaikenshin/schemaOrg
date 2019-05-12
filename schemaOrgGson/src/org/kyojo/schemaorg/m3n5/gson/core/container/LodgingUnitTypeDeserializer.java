package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.LODGING_UNIT_TYPE;
import org.kyojo.schemaorg.m3n5.core.Container.LodgingUnitType;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class LodgingUnitTypeDeserializer implements JsonDeserializer<LodgingUnitType> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public LodgingUnitType deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new LODGING_UNIT_TYPE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new LODGING_UNIT_TYPE(), LodgingUnitType.class, LODGING_UNIT_TYPE.class, fldMap);
	}

}
