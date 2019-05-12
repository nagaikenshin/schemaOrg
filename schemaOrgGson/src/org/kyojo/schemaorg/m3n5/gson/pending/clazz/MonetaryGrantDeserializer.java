package org.kyojo.schemaorg.m3n5.gson.pending.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.MONETARY_GRANT;
import org.kyojo.schemaorg.m3n5.pending.Clazz.MonetaryGrant;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class MonetaryGrantDeserializer implements JsonDeserializer<MonetaryGrant> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MonetaryGrant deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MONETARY_GRANT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MONETARY_GRANT(), MonetaryGrant.class, MONETARY_GRANT.class, fldMap);
	}

}
