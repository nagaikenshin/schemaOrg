package org.kyojo.schemaorg.m3n5.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.INCLUDES_ATTRACTION;
import org.kyojo.schemaorg.m3n5.pending.Container.IncludesAttraction;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class IncludesAttractionDeserializer implements JsonDeserializer<IncludesAttraction> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public IncludesAttraction deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new INCLUDES_ATTRACTION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new INCLUDES_ATTRACTION(), IncludesAttraction.class, INCLUDES_ATTRACTION.class, fldMap);
	}

}
