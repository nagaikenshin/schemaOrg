package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.TRAIN_NAME;
import org.kyojo.schemaorg.m3n5.core.Container.TrainName;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class TrainNameDeserializer implements JsonDeserializer<TrainName> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public TrainName deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new TRAIN_NAME(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new TRAIN_NAME(), TrainName.class, TRAIN_NAME.class, fldMap);
	}

}
