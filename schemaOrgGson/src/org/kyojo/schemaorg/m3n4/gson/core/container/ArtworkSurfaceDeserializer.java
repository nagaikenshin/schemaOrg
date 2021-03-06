package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.ARTWORK_SURFACE;
import org.kyojo.schemaorg.m3n4.core.Container.ArtworkSurface;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ArtworkSurfaceDeserializer implements JsonDeserializer<ArtworkSurface> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ArtworkSurface deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ARTWORK_SURFACE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ARTWORK_SURFACE(), ArtworkSurface.class, ARTWORK_SURFACE.class, fldMap);
	}

}
