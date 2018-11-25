package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.CLOSES;
import org.kyojo.schemaorg.m3n4.core.Container.Closes;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ClosesDeserializer implements JsonDeserializer<Closes> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Closes deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			java.time.LocalTime time = context.deserialize(jsonElement, java.time.LocalTime.class);
			return new CLOSES(time);
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CLOSES(), Closes.class, CLOSES.class, fldMap);
	}

}
