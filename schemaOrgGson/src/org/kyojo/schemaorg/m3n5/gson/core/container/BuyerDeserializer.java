package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.BUYER;
import org.kyojo.schemaorg.m3n5.core.Container.Buyer;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class BuyerDeserializer implements JsonDeserializer<Buyer> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Buyer deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new BUYER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new BUYER(), Buyer.class, BUYER.class, fldMap);
	}

}
