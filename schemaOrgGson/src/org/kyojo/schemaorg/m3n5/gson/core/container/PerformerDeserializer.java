package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.PERFORMER;
import org.kyojo.schemaorg.m3n5.core.Container.Performer;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class PerformerDeserializer implements JsonDeserializer<Performer> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Performer deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PERFORMER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PERFORMER(), Performer.class, PERFORMER.class, fldMap);
	}

}
