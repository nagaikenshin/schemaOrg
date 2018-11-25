package org.kyojo.schemaorg.m3n4.gson.auto.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.auto.impl.BUS_OR_COACH;
import org.kyojo.schemaorg.m3n4.auto.Clazz.BusOrCoach;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class BusOrCoachDeserializer implements JsonDeserializer<BusOrCoach> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public BusOrCoach deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new BUS_OR_COACH(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new BUS_OR_COACH(), BusOrCoach.class, BUS_OR_COACH.class, fldMap);
	}

}
