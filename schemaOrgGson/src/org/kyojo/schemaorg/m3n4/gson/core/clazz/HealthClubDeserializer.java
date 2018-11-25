package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.HEALTH_CLUB;
import org.kyojo.schemaorg.m3n4.core.Clazz.HealthClub;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class HealthClubDeserializer implements JsonDeserializer<HealthClub> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public HealthClub deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new HEALTH_CLUB(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new HEALTH_CLUB(), HealthClub.class, HEALTH_CLUB.class, fldMap);
	}

}
