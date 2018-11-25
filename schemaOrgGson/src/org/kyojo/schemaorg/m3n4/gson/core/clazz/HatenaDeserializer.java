package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.HATENA;
import org.kyojo.schemaorg.m3n4.core.Clazz.Hatena;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class HatenaDeserializer implements JsonDeserializer<Hatena> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Hatena deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new HATENA(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new HATENA(), Hatena.class, HATENA.class, fldMap);
	}

}
