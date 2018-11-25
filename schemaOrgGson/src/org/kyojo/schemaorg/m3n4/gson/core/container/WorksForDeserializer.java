package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.WORKS_FOR;
import org.kyojo.schemaorg.m3n4.core.Container.WorksFor;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class WorksForDeserializer implements JsonDeserializer<WorksFor> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public WorksFor deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new WORKS_FOR(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new WORKS_FOR(), WorksFor.class, WORKS_FOR.class, fldMap);
	}

}
