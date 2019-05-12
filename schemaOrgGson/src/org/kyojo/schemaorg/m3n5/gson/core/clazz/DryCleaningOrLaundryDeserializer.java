package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.DRY_CLEANING_OR_LAUNDRY;
import org.kyojo.schemaorg.m3n5.core.Clazz.DryCleaningOrLaundry;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class DryCleaningOrLaundryDeserializer implements JsonDeserializer<DryCleaningOrLaundry> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DryCleaningOrLaundry deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DRY_CLEANING_OR_LAUNDRY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DRY_CLEANING_OR_LAUNDRY(), DryCleaningOrLaundry.class, DRY_CLEANING_OR_LAUNDRY.class, fldMap);
	}

}
