package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.MOIN_MOIN;
import org.kyojo.schemaorg.m3n4.core.Clazz.MoinMoin;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class MoinMoinDeserializer implements JsonDeserializer<MoinMoin> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MoinMoin deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MOIN_MOIN(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MOIN_MOIN(), MoinMoin.class, MOIN_MOIN.class, fldMap);
	}

}
