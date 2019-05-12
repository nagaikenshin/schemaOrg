package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.PLAYGROUND;
import org.kyojo.schemaorg.m3n5.core.Clazz.Playground;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class PlaygroundDeserializer implements JsonDeserializer<Playground> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Playground deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PLAYGROUND(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PLAYGROUND(), Playground.class, PLAYGROUND.class, fldMap);
	}

}
