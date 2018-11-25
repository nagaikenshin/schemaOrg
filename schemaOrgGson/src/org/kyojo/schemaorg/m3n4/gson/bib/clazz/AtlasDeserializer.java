package org.kyojo.schemaorg.m3n4.gson.bib.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.bib.impl.ATLAS;
import org.kyojo.schemaorg.m3n4.bib.Clazz.Atlas;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class AtlasDeserializer implements JsonDeserializer<Atlas> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Atlas deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ATLAS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ATLAS(), Atlas.class, ATLAS.class, fldMap);
	}

}
