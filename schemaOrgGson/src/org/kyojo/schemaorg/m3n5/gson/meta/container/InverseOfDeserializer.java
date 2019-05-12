package org.kyojo.schemaorg.m3n5.gson.meta.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.meta.impl.INVERSE_OF;
import org.kyojo.schemaorg.m3n5.meta.Container.InverseOf;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class InverseOfDeserializer implements JsonDeserializer<InverseOf> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public InverseOf deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new INVERSE_OF(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new INVERSE_OF(), InverseOf.class, INVERSE_OF.class, fldMap);
	}

}
