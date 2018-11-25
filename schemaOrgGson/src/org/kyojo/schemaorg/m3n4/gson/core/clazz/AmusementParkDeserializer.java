package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.AMUSEMENT_PARK;
import org.kyojo.schemaorg.m3n4.core.Clazz.AmusementPark;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class AmusementParkDeserializer implements JsonDeserializer<AmusementPark> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AmusementPark deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new AMUSEMENT_PARK(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new AMUSEMENT_PARK(), AmusementPark.class, AMUSEMENT_PARK.class, fldMap);
	}

}
