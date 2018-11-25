package org.kyojo.schemaorg.m3n4.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.OVERDOSAGE;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.Overdosage;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class OverdosageDeserializer implements JsonDeserializer<Overdosage> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Overdosage deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new OVERDOSAGE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new OVERDOSAGE(), Overdosage.class, OVERDOSAGE.class, fldMap);
	}

}
