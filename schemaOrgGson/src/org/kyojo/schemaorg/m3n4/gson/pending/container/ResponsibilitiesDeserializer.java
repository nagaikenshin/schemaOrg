package org.kyojo.schemaorg.m3n4.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.RESPONSIBILITIES;
import org.kyojo.schemaorg.m3n4.pending.Container.Responsibilities;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ResponsibilitiesDeserializer implements JsonDeserializer<Responsibilities> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Responsibilities deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new RESPONSIBILITIES(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new RESPONSIBILITIES(), Responsibilities.class, RESPONSIBILITIES.class, fldMap);
	}

}
