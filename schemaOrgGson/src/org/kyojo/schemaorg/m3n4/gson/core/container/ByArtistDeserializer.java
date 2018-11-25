package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.BY_ARTIST;
import org.kyojo.schemaorg.m3n4.core.Container.ByArtist;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ByArtistDeserializer implements JsonDeserializer<ByArtist> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ByArtist deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new BY_ARTIST(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new BY_ARTIST(), ByArtist.class, BY_ARTIST.class, fldMap);
	}

}
