package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.EPISODE_NUMBER;
import org.kyojo.schemaorg.m3n4.core.Container.EpisodeNumber;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class EpisodeNumberDeserializer implements JsonDeserializer<EpisodeNumber> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public EpisodeNumber deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new EPISODE_NUMBER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new EPISODE_NUMBER(), EpisodeNumber.class, EPISODE_NUMBER.class, fldMap);
	}

}
