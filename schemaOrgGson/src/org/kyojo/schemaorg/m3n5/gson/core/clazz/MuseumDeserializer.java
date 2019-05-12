package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.MUSEUM;
import org.kyojo.schemaorg.m3n5.core.Clazz.Museum;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class MuseumDeserializer implements JsonDeserializer<Museum> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Museum deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MUSEUM(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MUSEUM(), Museum.class, MUSEUM.class, fldMap);
	}

}
