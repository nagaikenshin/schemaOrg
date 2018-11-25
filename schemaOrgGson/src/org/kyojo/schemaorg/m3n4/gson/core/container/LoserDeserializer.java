package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.LOSER;
import org.kyojo.schemaorg.m3n4.core.Container.Loser;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class LoserDeserializer implements JsonDeserializer<Loser> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Loser deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new LOSER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new LOSER(), Loser.class, LOSER.class, fldMap);
	}

}
