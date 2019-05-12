package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.IS_ACCESSIBLE_FOR_FREE;
import org.kyojo.schemaorg.m3n5.core.Container.IsAccessibleForFree;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class IsAccessibleForFreeDeserializer implements JsonDeserializer<IsAccessibleForFree> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public IsAccessibleForFree deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new IS_ACCESSIBLE_FOR_FREE(jsonElement.getAsBoolean());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new IS_ACCESSIBLE_FOR_FREE(), IsAccessibleForFree.class, IS_ACCESSIBLE_FOR_FREE.class, fldMap);
	}

}
