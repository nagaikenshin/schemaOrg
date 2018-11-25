package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.NUMBERED_POSITION;
import org.kyojo.schemaorg.m3n4.core.Container.NumberedPosition;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class NumberedPositionDeserializer implements JsonDeserializer<NumberedPosition> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public NumberedPosition deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new NUMBERED_POSITION(jsonElement.getAsBigDecimal());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new NUMBERED_POSITION(), NumberedPosition.class, NUMBERED_POSITION.class, fldMap);
	}

}
