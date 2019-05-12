package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.DISTILLERY;
import org.kyojo.schemaorg.m3n5.core.Clazz.Distillery;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class DistilleryDeserializer implements JsonDeserializer<Distillery> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Distillery deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DISTILLERY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DISTILLERY(), Distillery.class, DISTILLERY.class, fldMap);
	}

}
