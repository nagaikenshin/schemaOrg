package org.kyojo.schemaorg.m3n4.gson.bib.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.bib.impl.COVER_ART;
import org.kyojo.schemaorg.m3n4.bib.Clazz.CoverArt;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class CoverArtDeserializer implements JsonDeserializer<CoverArt> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CoverArt deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new COVER_ART(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new COVER_ART(), CoverArt.class, COVER_ART.class, fldMap);
	}

}
