package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.INTERACTION_STATISTIC;
import org.kyojo.schemaorg.m3n5.core.Container.InteractionStatistic;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class InteractionStatisticDeserializer implements JsonDeserializer<InteractionStatistic> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public InteractionStatistic deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new INTERACTION_STATISTIC(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new INTERACTION_STATISTIC(), InteractionStatistic.class, INTERACTION_STATISTIC.class, fldMap);
	}

}
