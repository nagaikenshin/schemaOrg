package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.CONTAINS_SEASON;
import org.kyojo.schemaorg.m3n4.core.Container.ContainsSeason;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ContainsSeasonDeserializer implements JsonDeserializer<ContainsSeason> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ContainsSeason deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CONTAINS_SEASON(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CONTAINS_SEASON(), ContainsSeason.class, CONTAINS_SEASON.class, fldMap);
	}

}
