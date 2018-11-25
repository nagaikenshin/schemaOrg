package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.ART_MEDIUM;
import org.kyojo.schemaorg.m3n4.core.Container.ArtMedium;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ArtMediumDeserializer implements JsonDeserializer<ArtMedium> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ArtMedium deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ART_MEDIUM(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ART_MEDIUM(), ArtMedium.class, ART_MEDIUM.class, fldMap);
	}

}
