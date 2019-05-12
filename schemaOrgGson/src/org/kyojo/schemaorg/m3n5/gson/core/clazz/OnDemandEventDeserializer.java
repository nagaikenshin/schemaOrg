package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.ON_DEMAND_EVENT;
import org.kyojo.schemaorg.m3n5.core.Clazz.OnDemandEvent;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class OnDemandEventDeserializer implements JsonDeserializer<OnDemandEvent> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public OnDemandEvent deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ON_DEMAND_EVENT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ON_DEMAND_EVENT(), OnDemandEvent.class, ON_DEMAND_EVENT.class, fldMap);
	}

}
