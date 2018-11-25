package org.kyojo.schemaorg.m3n4.gson.healthLifesci.physicalExam;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.physicalExam.NEURO;
import org.kyojo.schemaorg.m3n4.healthLifesci.PhysicalExam.Neuro;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class NeuroDeserializer implements JsonDeserializer<Neuro> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Neuro deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new NEURO(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new NEURO(), Neuro.class, NEURO.class, fldMap);
	}

}
