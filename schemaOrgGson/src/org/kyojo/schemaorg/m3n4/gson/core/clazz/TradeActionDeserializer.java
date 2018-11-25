package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.TRADE_ACTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.TradeAction;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class TradeActionDeserializer implements JsonDeserializer<TradeAction> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public TradeAction deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new TRADE_ACTION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new TRADE_ACTION(), TradeAction.class, TRADE_ACTION.class, fldMap);
	}

}
