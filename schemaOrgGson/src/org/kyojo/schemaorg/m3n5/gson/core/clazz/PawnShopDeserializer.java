package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.PAWN_SHOP;
import org.kyojo.schemaorg.m3n5.core.Clazz.PawnShop;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class PawnShopDeserializer implements JsonDeserializer<PawnShop> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PawnShop deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PAWN_SHOP(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PAWN_SHOP(), PawnShop.class, PAWN_SHOP.class, fldMap);
	}

}
