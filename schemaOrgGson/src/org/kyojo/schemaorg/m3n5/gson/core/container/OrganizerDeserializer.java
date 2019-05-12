package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.ORGANIZER;
import org.kyojo.schemaorg.m3n5.core.Container.Organizer;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class OrganizerDeserializer implements JsonDeserializer<Organizer> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Organizer deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ORGANIZER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ORGANIZER(), Organizer.class, ORGANIZER.class, fldMap);
	}

}