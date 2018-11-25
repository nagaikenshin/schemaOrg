package org.kyojo.schemaorg.m3n4.gson.healthLifesci.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.APPROVED_INDICATION;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.ApprovedIndication;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ApprovedIndicationDeserializer implements JsonDeserializer<ApprovedIndication> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ApprovedIndication deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new APPROVED_INDICATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new APPROVED_INDICATION(), ApprovedIndication.class, APPROVED_INDICATION.class, fldMap);
	}

}
