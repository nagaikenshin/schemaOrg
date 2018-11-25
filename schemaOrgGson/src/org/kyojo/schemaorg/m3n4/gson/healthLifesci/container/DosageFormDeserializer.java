package org.kyojo.schemaorg.m3n4.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.DOSAGE_FORM;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.DosageForm;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class DosageFormDeserializer implements JsonDeserializer<DosageForm> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DosageForm deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DOSAGE_FORM(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DOSAGE_FORM(), DosageForm.class, DOSAGE_FORM.class, fldMap);
	}

}
