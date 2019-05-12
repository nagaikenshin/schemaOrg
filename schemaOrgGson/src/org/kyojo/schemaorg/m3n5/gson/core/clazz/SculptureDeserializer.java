package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.SCULPTURE;
import org.kyojo.schemaorg.m3n5.core.Clazz.Sculpture;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class SculptureDeserializer implements JsonDeserializer<Sculpture> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Sculpture deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SCULPTURE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SCULPTURE(), Sculpture.class, SCULPTURE.class, fldMap);
	}

}
