package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.CHILD_CARE;
import org.kyojo.schemaorg.m3n5.core.Clazz.ChildCare;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ChildCareDeserializer implements JsonDeserializer<ChildCare> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ChildCare deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CHILD_CARE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CHILD_CARE(), ChildCare.class, CHILD_CARE.class, fldMap);
	}

}
