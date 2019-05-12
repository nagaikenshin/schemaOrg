package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.SEAT_ROW;
import org.kyojo.schemaorg.m3n5.core.Container.SeatRow;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class SeatRowDeserializer implements JsonDeserializer<SeatRow> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SeatRow deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SEAT_ROW(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SEAT_ROW(), SeatRow.class, SEAT_ROW.class, fldMap);
	}

}
