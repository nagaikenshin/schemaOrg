package org.kyojo.schemaorg.m3n5.gson.healthLifesci.medicineSystem;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.medicineSystem.HOMEOPATHIC;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicineSystem.Homeopathic;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class HomeopathicDeserializer implements JsonDeserializer<Homeopathic> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Homeopathic deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new HOMEOPATHIC(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new HOMEOPATHIC(), Homeopathic.class, HOMEOPATHIC.class, fldMap);
	}

}
