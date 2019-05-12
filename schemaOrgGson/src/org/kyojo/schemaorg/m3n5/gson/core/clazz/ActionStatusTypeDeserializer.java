package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.ACTION_STATUS_TYPE;
import org.kyojo.schemaorg.m3n5.core.Clazz.ActionStatusType;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ActionStatusTypeDeserializer implements JsonDeserializer<ActionStatusType> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ActionStatusType deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ACTION_STATUS_TYPE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ACTION_STATUS_TYPE(), ActionStatusType.class, ACTION_STATUS_TYPE.class, fldMap);
	}

}
