package org.kyojo.schemaorg.m3n5.gson.core.audience;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.audience.RESEARCHER;
import org.kyojo.schemaorg.m3n5.core.Audience.Researcher;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ResearcherDeserializer implements JsonDeserializer<Researcher> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Researcher deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new RESEARCHER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new RESEARCHER(), Researcher.class, RESEARCHER.class, fldMap);
	}

}
