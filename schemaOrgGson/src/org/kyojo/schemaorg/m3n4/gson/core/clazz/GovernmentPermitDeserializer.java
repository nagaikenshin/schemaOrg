package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.GOVERNMENT_PERMIT;
import org.kyojo.schemaorg.m3n4.core.Clazz.GovernmentPermit;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class GovernmentPermitDeserializer implements JsonDeserializer<GovernmentPermit> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public GovernmentPermit deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new GOVERNMENT_PERMIT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new GOVERNMENT_PERMIT(), GovernmentPermit.class, GOVERNMENT_PERMIT.class, fldMap);
	}

}
