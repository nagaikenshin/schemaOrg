package org.kyojo.schemaorg.m3n5.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.END_OFFSET;
import org.kyojo.schemaorg.m3n5.pending.Container.EndOffset;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class EndOffsetDeserializer implements JsonDeserializer<EndOffset> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public EndOffset deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new END_OFFSET(jsonElement.getAsBigDecimal());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new END_OFFSET(), EndOffset.class, END_OFFSET.class, fldMap);
	}

}
