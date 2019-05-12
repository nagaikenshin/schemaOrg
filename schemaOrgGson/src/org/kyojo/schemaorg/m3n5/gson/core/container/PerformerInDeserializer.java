package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.PERFORMER_IN;
import org.kyojo.schemaorg.m3n5.core.Container.PerformerIn;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class PerformerInDeserializer implements JsonDeserializer<PerformerIn> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PerformerIn deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PERFORMER_IN(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PERFORMER_IN(), PerformerIn.class, PERFORMER_IN.class, fldMap);
	}

}
