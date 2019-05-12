package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.MOSQUE;
import org.kyojo.schemaorg.m3n5.core.Clazz.Mosque;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class MosqueDeserializer implements JsonDeserializer<Mosque> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Mosque deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MOSQUE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MOSQUE(), Mosque.class, MOSQUE.class, fldMap);
	}

}
