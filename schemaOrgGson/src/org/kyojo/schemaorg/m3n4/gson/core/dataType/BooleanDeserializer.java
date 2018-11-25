package org.kyojo.schemaorg.m3n4.gson.core.dataType;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.BOOLEAN;
import org.kyojo.schemaorg.m3n4.core.DataType.Boolean;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class BooleanDeserializer implements JsonDeserializer<Boolean> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Boolean deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new BOOLEAN(jsonElement.getAsBoolean());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new BOOLEAN(), Boolean.class, BOOLEAN.class, fldMap);
	}

}
