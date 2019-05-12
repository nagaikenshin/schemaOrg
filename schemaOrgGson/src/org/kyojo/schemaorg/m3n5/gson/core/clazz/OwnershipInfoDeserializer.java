package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.OWNERSHIP_INFO;
import org.kyojo.schemaorg.m3n5.core.Clazz.OwnershipInfo;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class OwnershipInfoDeserializer implements JsonDeserializer<OwnershipInfo> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public OwnershipInfo deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new OWNERSHIP_INFO(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new OWNERSHIP_INFO(), OwnershipInfo.class, OWNERSHIP_INFO.class, fldMap);
	}

}
