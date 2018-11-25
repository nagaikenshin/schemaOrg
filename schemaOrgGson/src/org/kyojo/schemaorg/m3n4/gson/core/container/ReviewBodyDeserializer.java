package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.REVIEW_BODY;
import org.kyojo.schemaorg.m3n4.core.Container.ReviewBody;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ReviewBodyDeserializer implements JsonDeserializer<ReviewBody> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ReviewBody deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new REVIEW_BODY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new REVIEW_BODY(), ReviewBody.class, REVIEW_BODY.class, fldMap);
	}

}
