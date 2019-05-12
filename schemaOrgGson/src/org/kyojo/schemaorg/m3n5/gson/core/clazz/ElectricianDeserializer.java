package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.ELECTRICIAN;
import org.kyojo.schemaorg.m3n5.core.Clazz.Electrician;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class ElectricianDeserializer implements JsonDeserializer<Electrician> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Electrician deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ELECTRICIAN(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ELECTRICIAN(), Electrician.class, ELECTRICIAN.class, fldMap);
	}

}
