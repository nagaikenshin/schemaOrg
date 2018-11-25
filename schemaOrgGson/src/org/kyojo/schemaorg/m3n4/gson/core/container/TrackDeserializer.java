package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.TRACK;
import org.kyojo.schemaorg.m3n4.core.Container.Track;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class TrackDeserializer implements JsonDeserializer<Track> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Track deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new TRACK(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new TRACK(), Track.class, TRACK.class, fldMap);
	}

}
