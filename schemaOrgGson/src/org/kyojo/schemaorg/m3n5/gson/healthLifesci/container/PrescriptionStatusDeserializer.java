package org.kyojo.schemaorg.m3n5.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.PRESCRIPTION_STATUS;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.PrescriptionStatus;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class PrescriptionStatusDeserializer implements JsonDeserializer<PrescriptionStatus> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public PrescriptionStatus deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PRESCRIPTION_STATUS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PRESCRIPTION_STATUS(), PrescriptionStatus.class, PRESCRIPTION_STATUS.class, fldMap);
	}

}
