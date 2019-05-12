package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.TRAIN_TRIP;
import org.kyojo.schemaorg.m3n5.core.Clazz.TrainTrip;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class TrainTripDeserializer implements JsonDeserializer<TrainTrip> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public TrainTrip deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new TRAIN_TRIP(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new TRAIN_TRIP(), TrainTrip.class, TRAIN_TRIP.class, fldMap);
	}

}
