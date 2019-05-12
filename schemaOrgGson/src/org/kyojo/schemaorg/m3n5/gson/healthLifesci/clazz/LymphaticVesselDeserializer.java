package org.kyojo.schemaorg.m3n5.gson.healthLifesci.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.LYMPHATIC_VESSEL;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.LymphaticVessel;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class LymphaticVesselDeserializer implements JsonDeserializer<LymphaticVessel> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public LymphaticVessel deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new LYMPHATIC_VESSEL(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new LYMPHATIC_VESSEL(), LymphaticVessel.class, LYMPHATIC_VESSEL.class, fldMap);
	}

}
