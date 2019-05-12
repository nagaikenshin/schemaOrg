package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.SEASON_NUMBER;
import org.kyojo.schemaorg.m3n5.core.Container.SeasonNumber;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class SeasonNumberDeserializer implements JsonDeserializer<SeasonNumber> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SeasonNumber deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SEASON_NUMBER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SEASON_NUMBER(), SeasonNumber.class, SEASON_NUMBER.class, fldMap);
	}

}
