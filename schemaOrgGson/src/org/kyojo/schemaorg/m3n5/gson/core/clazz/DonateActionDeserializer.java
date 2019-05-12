package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.DONATE_ACTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.DonateAction;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class DonateActionDeserializer implements JsonDeserializer<DonateAction> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DonateAction deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DONATE_ACTION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DONATE_ACTION(), DonateAction.class, DONATE_ACTION.class, fldMap);
	}

}
