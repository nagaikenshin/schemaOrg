package org.kyojo.schemaorg.m3n5.gson.healthLifesci.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.DRUG_STRENGTH;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.DrugStrength;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class DrugStrengthDeserializer implements JsonDeserializer<DrugStrength> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DrugStrength deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DRUG_STRENGTH(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DRUG_STRENGTH(), DrugStrength.class, DRUG_STRENGTH.class, fldMap);
	}

}
