package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.LYRICIST;
import org.kyojo.schemaorg.m3n4.core.Container.Lyricist;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class LyricistDeserializer implements JsonDeserializer<Lyricist> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Lyricist deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new LYRICIST(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new LYRICIST(), Lyricist.class, LYRICIST.class, fldMap);
	}

}
