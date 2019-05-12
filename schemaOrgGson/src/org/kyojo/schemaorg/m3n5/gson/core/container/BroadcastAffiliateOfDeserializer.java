package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.BROADCAST_AFFILIATE_OF;
import org.kyojo.schemaorg.m3n5.core.Container.BroadcastAffiliateOf;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class BroadcastAffiliateOfDeserializer implements JsonDeserializer<BroadcastAffiliateOf> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public BroadcastAffiliateOf deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new BROADCAST_AFFILIATE_OF(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new BROADCAST_AFFILIATE_OF(), BroadcastAffiliateOf.class, BROADCAST_AFFILIATE_OF.class, fldMap);
	}

}
