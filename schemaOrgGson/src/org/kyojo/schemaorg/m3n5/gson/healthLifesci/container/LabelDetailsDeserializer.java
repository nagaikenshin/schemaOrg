package org.kyojo.schemaorg.m3n5.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.LABEL_DETAILS;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.LabelDetails;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class LabelDetailsDeserializer implements JsonDeserializer<LabelDetails> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public LabelDetails deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new LABEL_DETAILS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new LABEL_DETAILS(), LabelDetails.class, LABEL_DETAILS.class, fldMap);
	}

}