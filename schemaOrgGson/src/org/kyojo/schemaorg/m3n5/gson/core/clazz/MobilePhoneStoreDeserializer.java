package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.MOBILE_PHONE_STORE;
import org.kyojo.schemaorg.m3n5.core.Clazz.MobilePhoneStore;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class MobilePhoneStoreDeserializer implements JsonDeserializer<MobilePhoneStore> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MobilePhoneStore deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MOBILE_PHONE_STORE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MOBILE_PHONE_STORE(), MobilePhoneStore.class, MOBILE_PHONE_STORE.class, fldMap);
	}

}
