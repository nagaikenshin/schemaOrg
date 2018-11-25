package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.HINDU_TEMPLE;
import org.kyojo.schemaorg.m3n4.core.Clazz.HinduTemple;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class HinduTempleDeserializer implements JsonDeserializer<HinduTemple> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public HinduTemple deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new HINDU_TEMPLE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new HINDU_TEMPLE(), HinduTemple.class, HINDU_TEMPLE.class, fldMap);
	}

}
