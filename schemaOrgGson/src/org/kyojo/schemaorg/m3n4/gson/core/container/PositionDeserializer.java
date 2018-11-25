package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.POSITION;
import org.kyojo.schemaorg.m3n4.core.Container.Position;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class PositionDeserializer implements JsonDeserializer<Position> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Position deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new POSITION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new POSITION(), Position.class, POSITION.class, fldMap);
	}

}
