package org.kyojo.schemaorg.m3n4.gson.meta.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.meta.impl.SUPERSEDED_BY;
import org.kyojo.schemaorg.m3n4.meta.Container.SupersededBy;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class SupersededByDeserializer implements JsonDeserializer<SupersededBy> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SupersededBy deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SUPERSEDED_BY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SUPERSEDED_BY(), SupersededBy.class, SUPERSEDED_BY.class, fldMap);
	}

}
