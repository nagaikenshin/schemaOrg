package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.CHECK_IN_ACTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.CheckInAction;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class CheckInActionDeserializer implements JsonDeserializer<CheckInAction> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CheckInAction deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CHECK_IN_ACTION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CHECK_IN_ACTION(), CheckInAction.class, CHECK_IN_ACTION.class, fldMap);
	}

}
