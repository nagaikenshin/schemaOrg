package org.kyojo.schemaorg.m3n4.gson.bib.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.bib.impl.ARTIST;
import org.kyojo.schemaorg.m3n4.bib.Container.Artist;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ArtistDeserializer implements JsonDeserializer<Artist> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Artist deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ARTIST(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ARTIST(), Artist.class, ARTIST.class, fldMap);
	}

}
