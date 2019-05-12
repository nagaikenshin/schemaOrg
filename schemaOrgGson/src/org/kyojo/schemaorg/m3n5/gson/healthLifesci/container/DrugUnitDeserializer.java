package org.kyojo.schemaorg.m3n5.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.DRUG_UNIT;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.DrugUnit;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class DrugUnitDeserializer implements JsonDeserializer<DrugUnit> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DrugUnit deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DRUG_UNIT(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DRUG_UNIT(), DrugUnit.class, DRUG_UNIT.class, fldMap);
	}

}
