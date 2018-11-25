package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.WINNER;
import org.kyojo.schemaorg.m3n4.core.Container.Winner;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class WinnerDeserializer implements JsonDeserializer<Winner> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Winner deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new WINNER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new WINNER(), Winner.class, WINNER.class, fldMap);
	}

}
