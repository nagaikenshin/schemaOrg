package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.PROVIDES_SERVICE;
import org.kyojo.schemaorg.m3n4.core.Container.ProvidesService;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ProvidesServiceDeserializer implements JsonDeserializer<ProvidesService> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ProvidesService deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PROVIDES_SERVICE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PROVIDES_SERVICE(), ProvidesService.class, PROVIDES_SERVICE.class, fldMap);
	}

}
