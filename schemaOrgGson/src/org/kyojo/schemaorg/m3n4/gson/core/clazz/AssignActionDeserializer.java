package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.ASSIGN_ACTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.AssignAction;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class AssignActionDeserializer implements JsonDeserializer<AssignAction> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AssignAction deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ASSIGN_ACTION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ASSIGN_ACTION(), AssignAction.class, ASSIGN_ACTION.class, fldMap);
	}

}
