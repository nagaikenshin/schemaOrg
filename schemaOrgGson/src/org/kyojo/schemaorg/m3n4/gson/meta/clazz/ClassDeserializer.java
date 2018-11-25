package org.kyojo.schemaorg.m3n4.gson.meta.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.meta.impl.CLASS;
import org.kyojo.schemaorg.m3n4.meta.Clazz;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ClassDeserializer implements JsonDeserializer<Clazz.Class> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Clazz.Class deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CLASS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CLASS(), Clazz.Class.class, CLASS.class, fldMap);
	}

}
