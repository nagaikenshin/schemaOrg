package org.kyojo.schemaorg.m3n4.gson.healthLifesci.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.DIFFERENTIAL_DIAGNOSIS;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.DifferentialDiagnosis;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class DifferentialDiagnosisDeserializer implements JsonDeserializer<DifferentialDiagnosis> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public DifferentialDiagnosis deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new DIFFERENTIAL_DIAGNOSIS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new DIFFERENTIAL_DIAGNOSIS(), DifferentialDiagnosis.class, DIFFERENTIAL_DIAGNOSIS.class, fldMap);
	}

}
