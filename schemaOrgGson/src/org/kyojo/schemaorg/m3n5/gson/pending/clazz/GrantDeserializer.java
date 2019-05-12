package org.kyojo.schemaorg.m3n5.gson.pending.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.GRANT;
import org.kyojo.schemaorg.m3n5.pending.Clazz.Grant;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class GrantDeserializer implements JsonDeserializer<Grant> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Grant deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new GRANT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new GRANT(), Grant.class, GRANT.class, fldMap);
	}

}
