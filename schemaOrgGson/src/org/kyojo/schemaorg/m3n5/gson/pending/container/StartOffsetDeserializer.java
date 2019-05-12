package org.kyojo.schemaorg.m3n5.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.START_OFFSET;
import org.kyojo.schemaorg.m3n5.pending.Container.StartOffset;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class StartOffsetDeserializer implements JsonDeserializer<StartOffset> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public StartOffset deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new START_OFFSET(jsonElement.getAsBigDecimal());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new START_OFFSET(), StartOffset.class, START_OFFSET.class, fldMap);
	}

}
