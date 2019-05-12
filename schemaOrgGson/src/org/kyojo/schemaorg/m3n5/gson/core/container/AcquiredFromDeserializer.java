package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.ACQUIRED_FROM;
import org.kyojo.schemaorg.m3n5.core.Container.AcquiredFrom;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class AcquiredFromDeserializer implements JsonDeserializer<AcquiredFrom> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AcquiredFrom deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ACQUIRED_FROM(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ACQUIRED_FROM(), AcquiredFrom.class, ACQUIRED_FROM.class, fldMap);
	}

}
