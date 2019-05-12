package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.SPECIAL_COMMITMENTS;
import org.kyojo.schemaorg.m3n5.core.Container.SpecialCommitments;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class SpecialCommitmentsDeserializer implements JsonDeserializer<SpecialCommitments> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SpecialCommitments deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SPECIAL_COMMITMENTS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SPECIAL_COMMITMENTS(), SpecialCommitments.class, SPECIAL_COMMITMENTS.class, fldMap);
	}

}
