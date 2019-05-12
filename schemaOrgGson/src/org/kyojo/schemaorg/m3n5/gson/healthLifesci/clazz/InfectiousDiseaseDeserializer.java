package org.kyojo.schemaorg.m3n5.gson.healthLifesci.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.INFECTIOUS_DISEASE;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.InfectiousDisease;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class InfectiousDiseaseDeserializer implements JsonDeserializer<InfectiousDisease> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public InfectiousDisease deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new INFECTIOUS_DISEASE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new INFECTIOUS_DISEASE(), InfectiousDisease.class, INFECTIOUS_DISEASE.class, fldMap);
	}

}
