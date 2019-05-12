package org.kyojo.schemaorg.m3n5.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.SOURCED_FROM;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.SourcedFrom;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class SourcedFromDeserializer implements JsonDeserializer<SourcedFrom> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SourcedFrom deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SOURCED_FROM(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SOURCED_FROM(), SourcedFrom.class, SOURCED_FROM.class, fldMap);
	}

}
