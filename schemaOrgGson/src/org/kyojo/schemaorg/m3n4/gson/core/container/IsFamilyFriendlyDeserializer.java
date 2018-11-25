package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.IS_FAMILY_FRIENDLY;
import org.kyojo.schemaorg.m3n4.core.Container.IsFamilyFriendly;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class IsFamilyFriendlyDeserializer implements JsonDeserializer<IsFamilyFriendly> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public IsFamilyFriendly deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new IS_FAMILY_FRIENDLY(jsonElement.getAsBoolean());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new IS_FAMILY_FRIENDLY(), IsFamilyFriendly.class, IS_FAMILY_FRIENDLY.class, fldMap);
	}

}
