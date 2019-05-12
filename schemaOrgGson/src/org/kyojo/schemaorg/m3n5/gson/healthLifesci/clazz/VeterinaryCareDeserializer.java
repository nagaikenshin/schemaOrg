package org.kyojo.schemaorg.m3n5.gson.healthLifesci.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.VETERINARY_CARE;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.VeterinaryCare;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class VeterinaryCareDeserializer implements JsonDeserializer<VeterinaryCare> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public VeterinaryCare deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new VETERINARY_CARE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new VETERINARY_CARE(), VeterinaryCare.class, VETERINARY_CARE.class, fldMap);
	}

}
