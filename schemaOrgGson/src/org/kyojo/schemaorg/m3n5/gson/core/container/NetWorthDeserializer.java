package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.NET_WORTH;
import org.kyojo.schemaorg.m3n5.core.Container.NetWorth;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class NetWorthDeserializer implements JsonDeserializer<NetWorth> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public NetWorth deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new NET_WORTH(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new NET_WORTH(), NetWorth.class, NET_WORTH.class, fldMap);
	}

}
