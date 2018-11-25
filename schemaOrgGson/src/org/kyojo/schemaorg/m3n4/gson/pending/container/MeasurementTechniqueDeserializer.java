package org.kyojo.schemaorg.m3n4.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.MEASUREMENT_TECHNIQUE;
import org.kyojo.schemaorg.m3n4.pending.Container.MeasurementTechnique;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class MeasurementTechniqueDeserializer implements JsonDeserializer<MeasurementTechnique> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MeasurementTechnique deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MEASUREMENT_TECHNIQUE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MEASUREMENT_TECHNIQUE(), MeasurementTechnique.class, MEASUREMENT_TECHNIQUE.class, fldMap);
	}

}
