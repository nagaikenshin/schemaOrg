package org.kyojo.schemaorg.m3n5.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.CAUSE_OF;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.CauseOf;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class CauseOfDeserializer implements JsonDeserializer<CauseOf> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CauseOf deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CAUSE_OF(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CAUSE_OF(), CauseOf.class, CAUSE_OF.class, fldMap);
	}

}
