package org.kyojo.schemaorg.m3n4.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.NON_PROPRIETARY_NAME;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.NonProprietaryName;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class NonProprietaryNameDeserializer implements JsonDeserializer<NonProprietaryName> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public NonProprietaryName deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new NON_PROPRIETARY_NAME(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new NON_PROPRIETARY_NAME(), NonProprietaryName.class, NON_PROPRIETARY_NAME.class, fldMap);
	}

}
