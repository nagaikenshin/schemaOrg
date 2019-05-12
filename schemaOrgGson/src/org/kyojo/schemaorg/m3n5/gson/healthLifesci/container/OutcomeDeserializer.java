package org.kyojo.schemaorg.m3n5.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.OUTCOME;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.Outcome;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class OutcomeDeserializer implements JsonDeserializer<Outcome> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Outcome deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new OUTCOME(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new OUTCOME(), Outcome.class, OUTCOME.class, fldMap);
	}

}