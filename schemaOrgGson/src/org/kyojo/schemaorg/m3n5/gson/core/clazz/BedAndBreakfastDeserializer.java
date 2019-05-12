package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.BED_AND_BREAKFAST;
import org.kyojo.schemaorg.m3n5.core.Clazz.BedAndBreakfast;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class BedAndBreakfastDeserializer implements JsonDeserializer<BedAndBreakfast> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public BedAndBreakfast deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new BED_AND_BREAKFAST(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new BED_AND_BREAKFAST(), BedAndBreakfast.class, BED_AND_BREAKFAST.class, fldMap);
	}

}
