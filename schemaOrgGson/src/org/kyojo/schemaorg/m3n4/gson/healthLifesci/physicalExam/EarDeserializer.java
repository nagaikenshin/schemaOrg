package org.kyojo.schemaorg.m3n4.gson.healthLifesci.physicalExam;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.physicalExam.EAR;
import org.kyojo.schemaorg.m3n4.healthLifesci.PhysicalExam.Ear;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class EarDeserializer implements JsonDeserializer<Ear> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Ear deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new EAR(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new EAR(), Ear.class, EAR.class, fldMap);
	}

}
