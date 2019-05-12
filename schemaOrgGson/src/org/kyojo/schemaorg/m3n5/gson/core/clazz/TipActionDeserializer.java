package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.TIP_ACTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.TipAction;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class TipActionDeserializer implements JsonDeserializer<TipAction> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public TipAction deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new TIP_ACTION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new TIP_ACTION(), TipAction.class, TIP_ACTION.class, fldMap);
	}

}
