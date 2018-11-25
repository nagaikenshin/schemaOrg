package org.kyojo.schemaorg.m3n4.gson.healthLifesci.medicineSystem;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.medicineSystem.WESTERN_CONVENTIONAL;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicineSystem.WesternConventional;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class WesternConventionalDeserializer implements JsonDeserializer<WesternConventional> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public WesternConventional deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new WESTERN_CONVENTIONAL(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new WESTERN_CONVENTIONAL(), WesternConventional.class, WESTERN_CONVENTIONAL.class, fldMap);
	}

}
