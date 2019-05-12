package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.COMPETITOR;
import org.kyojo.schemaorg.m3n5.core.Container.Competitor;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class CompetitorDeserializer implements JsonDeserializer<Competitor> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Competitor deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new COMPETITOR(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new COMPETITOR(), Competitor.class, COMPETITOR.class, fldMap);
	}

}
