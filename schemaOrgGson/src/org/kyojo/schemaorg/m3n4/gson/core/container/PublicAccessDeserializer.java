package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.PUBLIC_ACCESS;
import org.kyojo.schemaorg.m3n4.core.Container.PublicAccess;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class PublicAccessDeserializer implements JsonDeserializer<PublicAccess> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PublicAccess deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PUBLIC_ACCESS(jsonElement.getAsBoolean());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PUBLIC_ACCESS(), PublicAccess.class, PUBLIC_ACCESS.class, fldMap);
	}

}
