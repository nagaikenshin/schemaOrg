package org.kyojo.schemaorg.m3n5.gson.healthLifesci.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.TREATMENT_INDICATION;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.TreatmentIndication;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class TreatmentIndicationDeserializer implements JsonDeserializer<TreatmentIndication> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public TreatmentIndication deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new TREATMENT_INDICATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new TREATMENT_INDICATION(), TreatmentIndication.class, TREATMENT_INDICATION.class, fldMap);
	}

}
