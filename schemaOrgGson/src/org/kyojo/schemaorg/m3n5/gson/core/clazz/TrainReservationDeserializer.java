package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.TRAIN_RESERVATION;
import org.kyojo.schemaorg.m3n5.core.Clazz.TrainReservation;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class TrainReservationDeserializer implements JsonDeserializer<TrainReservation> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public TrainReservation deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new TRAIN_RESERVATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new TRAIN_RESERVATION(), TrainReservation.class, TRAIN_RESERVATION.class, fldMap);
	}

}
