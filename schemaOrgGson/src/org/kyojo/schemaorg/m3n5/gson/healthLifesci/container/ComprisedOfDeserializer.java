package org.kyojo.schemaorg.m3n5.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.COMPRISED_OF;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.ComprisedOf;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ComprisedOfDeserializer implements JsonDeserializer<ComprisedOf> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ComprisedOf deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new COMPRISED_OF(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new COMPRISED_OF(), ComprisedOf.class, COMPRISED_OF.class, fldMap);
	}

}
