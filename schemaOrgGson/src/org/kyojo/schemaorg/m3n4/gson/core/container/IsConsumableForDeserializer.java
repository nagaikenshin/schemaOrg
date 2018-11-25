package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.IS_CONSUMABLE_FOR;
import org.kyojo.schemaorg.m3n4.core.Container.IsConsumableFor;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class IsConsumableForDeserializer implements JsonDeserializer<IsConsumableFor> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public IsConsumableFor deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new IS_CONSUMABLE_FOR(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new IS_CONSUMABLE_FOR(), IsConsumableFor.class, IS_CONSUMABLE_FOR.class, fldMap);
	}

}
