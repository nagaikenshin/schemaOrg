package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.TELEVISION_STATION;
import org.kyojo.schemaorg.m3n5.core.Clazz.TelevisionStation;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class TelevisionStationDeserializer implements JsonDeserializer<TelevisionStation> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public TelevisionStation deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new TELEVISION_STATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new TELEVISION_STATION(), TelevisionStation.class, TELEVISION_STATION.class, fldMap);
	}

}
