package org.kyojo.schemaorg.m3n5.gson.healthLifesci.medicineSystem;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.medicineSystem.OSTEOPATHIC;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicineSystem.Osteopathic;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class OsteopathicDeserializer implements JsonDeserializer<Osteopathic> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Osteopathic deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new OSTEOPATHIC(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new OSTEOPATHIC(), Osteopathic.class, OSTEOPATHIC.class, fldMap);
	}

}
