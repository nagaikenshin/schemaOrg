package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.IMAGE_GALLERY;
import org.kyojo.schemaorg.m3n5.core.Clazz.ImageGallery;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ImageGalleryDeserializer implements JsonDeserializer<ImageGallery> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ImageGallery deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new IMAGE_GALLERY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new IMAGE_GALLERY(), ImageGallery.class, IMAGE_GALLERY.class, fldMap);
	}

}
