package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.BUDDHIST_TEMPLE;
import org.kyojo.schemaorg.m3n4.core.Clazz.BuddhistTemple;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class BuddhistTempleDeserializer implements JsonDeserializer<BuddhistTemple> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public BuddhistTemple deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new BUDDHIST_TEMPLE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new BUDDHIST_TEMPLE(), BuddhistTemple.class, BUDDHIST_TEMPLE.class, fldMap);
	}

}
