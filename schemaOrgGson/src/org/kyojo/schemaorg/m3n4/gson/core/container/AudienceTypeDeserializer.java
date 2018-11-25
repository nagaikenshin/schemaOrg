package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.AUDIENCE_TYPE;
import org.kyojo.schemaorg.m3n4.core.Container.AudienceType;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class AudienceTypeDeserializer implements JsonDeserializer<AudienceType> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AudienceType deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new AUDIENCE_TYPE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new AUDIENCE_TYPE(), AudienceType.class, AUDIENCE_TYPE.class, fldMap);
	}

}
