package org.kyojo.schemaorg.m3n5.gson.auto.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.auto.impl.MOTORCYCLE;
import org.kyojo.schemaorg.m3n5.auto.Clazz.Motorcycle;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class MotorcycleDeserializer implements JsonDeserializer<Motorcycle> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Motorcycle deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MOTORCYCLE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MOTORCYCLE(), Motorcycle.class, MOTORCYCLE.class, fldMap);
	}

}
