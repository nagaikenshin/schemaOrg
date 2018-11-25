package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.PARENT_SERVICE;
import org.kyojo.schemaorg.m3n4.core.Container.ParentService;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ParentServiceDeserializer implements JsonDeserializer<ParentService> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ParentService deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PARENT_SERVICE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PARENT_SERVICE(), ParentService.class, PARENT_SERVICE.class, fldMap);
	}

}
