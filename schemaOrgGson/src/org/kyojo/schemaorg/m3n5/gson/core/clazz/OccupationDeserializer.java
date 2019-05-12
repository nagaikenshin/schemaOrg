package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.OCCUPATION;
import org.kyojo.schemaorg.m3n5.core.Clazz.Occupation;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class OccupationDeserializer implements JsonDeserializer<Occupation> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Occupation deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new OCCUPATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new OCCUPATION(), Occupation.class, OCCUPATION.class, fldMap);
	}

}
