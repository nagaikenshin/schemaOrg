package org.kyojo.schemaorg.m3n5.gson.healthLifesci.medicalObservationalStudyDesign;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.medicalObservationalStudyDesign.REGISTRY;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicalObservationalStudyDesign.Registry;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class RegistryDeserializer implements JsonDeserializer<Registry> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Registry deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new REGISTRY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new REGISTRY(), Registry.class, REGISTRY.class, fldMap);
	}

}
