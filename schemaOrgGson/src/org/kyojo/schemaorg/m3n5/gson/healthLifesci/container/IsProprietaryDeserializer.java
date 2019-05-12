package org.kyojo.schemaorg.m3n5.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.IS_PROPRIETARY;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.IsProprietary;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class IsProprietaryDeserializer implements JsonDeserializer<IsProprietary> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public IsProprietary deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new IS_PROPRIETARY(jsonElement.getAsBoolean());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new IS_PROPRIETARY(), IsProprietary.class, IS_PROPRIETARY.class, fldMap);
	}

}
