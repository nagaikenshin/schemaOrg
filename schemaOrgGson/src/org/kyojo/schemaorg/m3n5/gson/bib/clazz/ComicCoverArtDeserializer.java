package org.kyojo.schemaorg.m3n5.gson.bib.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.bib.impl.COMIC_COVER_ART;
import org.kyojo.schemaorg.m3n5.bib.Clazz.ComicCoverArt;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ComicCoverArtDeserializer implements JsonDeserializer<ComicCoverArt> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ComicCoverArt deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new COMIC_COVER_ART(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new COMIC_COVER_ART(), ComicCoverArt.class, COMIC_COVER_ART.class, fldMap);
	}

}
