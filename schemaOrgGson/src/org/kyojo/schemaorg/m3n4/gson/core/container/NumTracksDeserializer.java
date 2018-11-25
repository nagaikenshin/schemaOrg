package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.NUM_TRACKS;
import org.kyojo.schemaorg.m3n4.core.Container.NumTracks;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class NumTracksDeserializer implements JsonDeserializer<NumTracks> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public NumTracks deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			try {
				return new NUM_TRACKS(jsonElement.getAsLong());
			} catch(NumberFormatException nfe) {
				return null;
			}
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new NUM_TRACKS(), NumTracks.class, NUM_TRACKS.class, fldMap);
	}

}
