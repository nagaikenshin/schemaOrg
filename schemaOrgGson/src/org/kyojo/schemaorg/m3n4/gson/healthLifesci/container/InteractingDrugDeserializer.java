package org.kyojo.schemaorg.m3n4.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.INTERACTING_DRUG;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.InteractingDrug;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class InteractingDrugDeserializer implements JsonDeserializer<InteractingDrug> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public InteractingDrug deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new INTERACTING_DRUG(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new INTERACTING_DRUG(), InteractingDrug.class, INTERACTING_DRUG.class, fldMap);
	}

}
