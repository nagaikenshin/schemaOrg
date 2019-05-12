package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.APARTMENT_COMPLEX;
import org.kyojo.schemaorg.m3n5.core.Clazz.ApartmentComplex;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ApartmentComplexDeserializer implements JsonDeserializer<ApartmentComplex> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ApartmentComplex deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new APARTMENT_COMPLEX(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new APARTMENT_COMPLEX(), ApartmentComplex.class, APARTMENT_COMPLEX.class, fldMap);
	}

}