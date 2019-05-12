package org.kyojo.schemaorg.m3n5.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.KNOWS_ABOUT;
import org.kyojo.schemaorg.m3n5.pending.Container.KnowsAbout;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class KnowsAboutDeserializer implements JsonDeserializer<KnowsAbout> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public KnowsAbout deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new KNOWS_ABOUT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new KNOWS_ABOUT(), KnowsAbout.class, KNOWS_ABOUT.class, fldMap);
	}

}
