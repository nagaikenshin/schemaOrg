package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.IS_SIMILAR_TO;
import org.kyojo.schemaorg.m3n5.core.Container.IsSimilarTo;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class IsSimilarToDeserializer implements JsonDeserializer<IsSimilarTo> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public IsSimilarTo deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new IS_SIMILAR_TO(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new IS_SIMILAR_TO(), IsSimilarTo.class, IS_SIMILAR_TO.class, fldMap);
	}

}
