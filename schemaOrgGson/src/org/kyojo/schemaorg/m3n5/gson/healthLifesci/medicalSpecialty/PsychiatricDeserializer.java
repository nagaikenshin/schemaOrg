package org.kyojo.schemaorg.m3n5.gson.healthLifesci.medicalSpecialty;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.medicalSpecialty.PSYCHIATRIC;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicalSpecialty.Psychiatric;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class PsychiatricDeserializer implements JsonDeserializer<Psychiatric> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Psychiatric deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PSYCHIATRIC(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PSYCHIATRIC(), Psychiatric.class, PSYCHIATRIC.class, fldMap);
	}

}
