package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.SEEKS;
import org.kyojo.schemaorg.m3n5.core.Container.Seeks;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class SeeksDeserializer implements JsonDeserializer<Seeks> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Seeks deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SEEKS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SEEKS(), Seeks.class, SEEKS.class, fldMap);
	}

}
