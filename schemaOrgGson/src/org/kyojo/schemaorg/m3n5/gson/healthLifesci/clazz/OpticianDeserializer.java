package org.kyojo.schemaorg.m3n5.gson.healthLifesci.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.OPTICIAN;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.Optician;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class OpticianDeserializer implements JsonDeserializer<Optician> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Optician deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new OPTICIAN(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new OPTICIAN(), Optician.class, OPTICIAN.class, fldMap);
	}

}
