package org.kyojo.schemaorg.m3n4.gson.healthLifesci.medicineSystem;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.medicineSystem.CHIROPRACTIC;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicineSystem.Chiropractic;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ChiropracticDeserializer implements JsonDeserializer<Chiropractic> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Chiropractic deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CHIROPRACTIC(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CHIROPRACTIC(), Chiropractic.class, CHIROPRACTIC.class, fldMap);
	}

}
