package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.DISTRIBUTION;
import org.kyojo.schemaorg.m3n5.core.Container.Distribution;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class DistributionDeserializer implements JsonDeserializer<Distribution> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Distribution deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DISTRIBUTION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DISTRIBUTION(), Distribution.class, DISTRIBUTION.class, fldMap);
	}

}
