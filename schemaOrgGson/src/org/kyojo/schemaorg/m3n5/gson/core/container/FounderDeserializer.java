package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.FOUNDER;
import org.kyojo.schemaorg.m3n5.core.Container.Founder;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class FounderDeserializer implements JsonDeserializer<Founder> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Founder deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new FOUNDER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new FOUNDER(), Founder.class, FOUNDER.class, fldMap);
	}

}
