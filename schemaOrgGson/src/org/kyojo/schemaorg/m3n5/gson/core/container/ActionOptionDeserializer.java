package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.ACTION_OPTION;
import org.kyojo.schemaorg.m3n5.core.Container.ActionOption;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ActionOptionDeserializer implements JsonDeserializer<ActionOption> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ActionOption deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ACTION_OPTION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ACTION_OPTION(), ActionOption.class, ACTION_OPTION.class, fldMap);
	}

}
