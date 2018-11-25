package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.TRAIN_NUMBER;
import org.kyojo.schemaorg.m3n4.core.Container.TrainNumber;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class TrainNumberDeserializer implements JsonDeserializer<TrainNumber> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public TrainNumber deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new TRAIN_NUMBER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new TRAIN_NUMBER(), TrainNumber.class, TRAIN_NUMBER.class, fldMap);
	}

}
