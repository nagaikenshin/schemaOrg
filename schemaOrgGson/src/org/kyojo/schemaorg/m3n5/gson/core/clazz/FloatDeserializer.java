package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.FLOAT;
import org.kyojo.schemaorg.m3n5.core.Clazz;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class FloatDeserializer implements JsonDeserializer<Clazz.Float> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Clazz.Float deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			try {
				return new FLOAT(jsonElement.getAsDouble());
			} catch(NumberFormatException nfe) {
				return null;
			}
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new FLOAT(), Clazz.Float.class, FLOAT.class, fldMap);
	}

}
