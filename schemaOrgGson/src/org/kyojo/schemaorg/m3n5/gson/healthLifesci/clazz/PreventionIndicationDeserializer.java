package org.kyojo.schemaorg.m3n5.gson.healthLifesci.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.PREVENTION_INDICATION;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.PreventionIndication;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class PreventionIndicationDeserializer implements JsonDeserializer<PreventionIndication> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PreventionIndication deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PREVENTION_INDICATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PREVENTION_INDICATION(), PreventionIndication.class, PREVENTION_INDICATION.class, fldMap);
	}

}