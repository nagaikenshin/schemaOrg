package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.MODIFIED_TIME;
import org.kyojo.schemaorg.m3n4.core.Container.ModifiedTime;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ModifiedTimeDeserializer implements JsonDeserializer<ModifiedTime> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ModifiedTime deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			java.time.OffsetDateTime dateTime = context.deserialize(jsonElement, java.time.OffsetDateTime.class);
			return new MODIFIED_TIME(dateTime);
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MODIFIED_TIME(), ModifiedTime.class, MODIFIED_TIME.class, fldMap);
	}

}
