package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.HOSPITAL;
import org.kyojo.schemaorg.m3n5.core.Clazz.Hospital;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class HospitalDeserializer implements JsonDeserializer<Hospital> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Hospital deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new HOSPITAL(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new HOSPITAL(), Hospital.class, HOSPITAL.class, fldMap);
	}

}
