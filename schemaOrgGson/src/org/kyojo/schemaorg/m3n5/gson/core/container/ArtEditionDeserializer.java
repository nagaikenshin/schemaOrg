package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.ART_EDITION;
import org.kyojo.schemaorg.m3n5.core.Container.ArtEdition;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ArtEditionDeserializer implements JsonDeserializer<ArtEdition> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ArtEdition deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ART_EDITION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ART_EDITION(), ArtEdition.class, ART_EDITION.class, fldMap);
	}

}
