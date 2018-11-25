package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.TRAIN_STATION;
import org.kyojo.schemaorg.m3n4.core.Clazz.TrainStation;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class TrainStationDeserializer implements JsonDeserializer<TrainStation> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public TrainStation deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new TRAIN_STATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new TRAIN_STATION(), TrainStation.class, TRAIN_STATION.class, fldMap);
	}

}
