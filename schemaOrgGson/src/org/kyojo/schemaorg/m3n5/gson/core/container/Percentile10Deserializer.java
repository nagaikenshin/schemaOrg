package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.PERCENTILE10;
import org.kyojo.schemaorg.m3n5.core.Container.Percentile10;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class Percentile10Deserializer implements JsonDeserializer<Percentile10> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Percentile10 deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PERCENTILE10(jsonElement.getAsBigDecimal());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PERCENTILE10(), Percentile10.class, PERCENTILE10.class, fldMap);
	}

}
