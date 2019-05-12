package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.ALLOCATE_ACTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.AllocateAction;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class AllocateActionDeserializer implements JsonDeserializer<AllocateAction> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AllocateAction deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ALLOCATE_ACTION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ALLOCATE_ACTION(), AllocateAction.class, ALLOCATE_ACTION.class, fldMap);
	}

}