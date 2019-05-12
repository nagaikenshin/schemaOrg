package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.PART_OF_EPISODE;
import org.kyojo.schemaorg.m3n5.core.Container.PartOfEpisode;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class PartOfEpisodeDeserializer implements JsonDeserializer<PartOfEpisode> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PartOfEpisode deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PART_OF_EPISODE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PART_OF_EPISODE(), PartOfEpisode.class, PART_OF_EPISODE.class, fldMap);
	}

}
