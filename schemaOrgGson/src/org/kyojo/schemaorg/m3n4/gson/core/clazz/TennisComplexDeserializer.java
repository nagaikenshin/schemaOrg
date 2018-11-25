package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.TENNIS_COMPLEX;
import org.kyojo.schemaorg.m3n4.core.Clazz.TennisComplex;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class TennisComplexDeserializer implements JsonDeserializer<TennisComplex> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public TennisComplex deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new TENNIS_COMPLEX(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new TENNIS_COMPLEX(), TennisComplex.class, TENNIS_COMPLEX.class, fldMap);
	}

}
