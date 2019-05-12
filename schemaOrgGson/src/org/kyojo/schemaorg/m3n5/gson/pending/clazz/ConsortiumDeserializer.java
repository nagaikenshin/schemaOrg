package org.kyojo.schemaorg.m3n5.gson.pending.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.pending.impl.CONSORTIUM;
import org.kyojo.schemaorg.m3n5.pending.Clazz.Consortium;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ConsortiumDeserializer implements JsonDeserializer<Consortium> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Consortium deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CONSORTIUM(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CONSORTIUM(), Consortium.class, CONSORTIUM.class, fldMap);
	}

}
