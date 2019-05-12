package org.kyojo.schemaorg.m3n5.gson.bib.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.bib.impl.VARIANT_COVER;
import org.kyojo.schemaorg.m3n5.bib.Container.VariantCover;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class VariantCoverDeserializer implements JsonDeserializer<VariantCover> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public VariantCover deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new VARIANT_COVER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new VARIANT_COVER(), VariantCover.class, VARIANT_COVER.class, fldMap);
	}

}
