package org.kyojo.schemaorg.m3n4.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.REPETITIONS;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.Repetitions;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class RepetitionsDeserializer implements JsonDeserializer<Repetitions> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Repetitions deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new REPETITIONS(jsonElement.getAsBigDecimal());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new REPETITIONS(), Repetitions.class, REPETITIONS.class, fldMap);
	}

}
