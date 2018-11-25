package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.SPORTING_GOODS_STORE;
import org.kyojo.schemaorg.m3n4.core.Clazz.SportingGoodsStore;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class SportingGoodsStoreDeserializer implements JsonDeserializer<SportingGoodsStore> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SportingGoodsStore deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SPORTING_GOODS_STORE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SPORTING_GOODS_STORE(), SportingGoodsStore.class, SPORTING_GOODS_STORE.class, fldMap);
	}

}
