package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.REVIEWED_BY;
import org.kyojo.schemaorg.m3n4.core.Container.ReviewedBy;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ReviewedByDeserializer implements JsonDeserializer<ReviewedBy> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ReviewedBy deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new REVIEWED_BY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new REVIEWED_BY(), ReviewedBy.class, REVIEWED_BY.class, fldMap);
	}

}
