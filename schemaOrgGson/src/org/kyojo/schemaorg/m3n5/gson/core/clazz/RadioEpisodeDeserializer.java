package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.RADIO_EPISODE;
import org.kyojo.schemaorg.m3n5.core.Clazz.RadioEpisode;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class RadioEpisodeDeserializer implements JsonDeserializer<RadioEpisode> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public RadioEpisode deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new RADIO_EPISODE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new RADIO_EPISODE(), RadioEpisode.class, RADIO_EPISODE.class, fldMap);
	}

}
