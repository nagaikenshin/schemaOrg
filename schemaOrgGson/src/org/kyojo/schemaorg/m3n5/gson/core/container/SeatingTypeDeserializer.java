package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.SEATING_TYPE;
import org.kyojo.schemaorg.m3n5.core.Container.SeatingType;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class SeatingTypeDeserializer implements JsonDeserializer<SeatingType> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SeatingType deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SEATING_TYPE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SEATING_TYPE(), SeatingType.class, SEATING_TYPE.class, fldMap);
	}

}
