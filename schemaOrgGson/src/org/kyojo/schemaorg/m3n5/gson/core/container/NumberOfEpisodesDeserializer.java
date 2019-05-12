package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.NUMBER_OF_EPISODES;
import org.kyojo.schemaorg.m3n5.core.Container.NumberOfEpisodes;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class NumberOfEpisodesDeserializer implements JsonDeserializer<NumberOfEpisodes> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public NumberOfEpisodes deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			try {
				return new NUMBER_OF_EPISODES(jsonElement.getAsLong());
			} catch(NumberFormatException nfe) {
				return null;
			}
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new NUMBER_OF_EPISODES(), NumberOfEpisodes.class, NUMBER_OF_EPISODES.class, fldMap);
	}

}
