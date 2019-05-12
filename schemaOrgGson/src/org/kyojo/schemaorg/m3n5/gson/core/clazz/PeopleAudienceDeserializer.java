package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.PEOPLE_AUDIENCE;
import org.kyojo.schemaorg.m3n5.core.Clazz.PeopleAudience;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class PeopleAudienceDeserializer implements JsonDeserializer<PeopleAudience> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PeopleAudience deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PEOPLE_AUDIENCE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PEOPLE_AUDIENCE(), PeopleAudience.class, PEOPLE_AUDIENCE.class, fldMap);
	}

}
