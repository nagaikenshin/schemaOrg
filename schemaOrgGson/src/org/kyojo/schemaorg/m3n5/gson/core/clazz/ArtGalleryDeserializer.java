package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.ART_GALLERY;
import org.kyojo.schemaorg.m3n5.core.Clazz.ArtGallery;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ArtGalleryDeserializer implements JsonDeserializer<ArtGallery> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ArtGallery deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ART_GALLERY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ART_GALLERY(), ArtGallery.class, ART_GALLERY.class, fldMap);
	}

}
