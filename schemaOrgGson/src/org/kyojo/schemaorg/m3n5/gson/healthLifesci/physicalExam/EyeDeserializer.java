package org.kyojo.schemaorg.m3n5.gson.healthLifesci.physicalExam;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.physicalExam.EYE;
import org.kyojo.schemaorg.m3n5.healthLifesci.PhysicalExam.Eye;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class EyeDeserializer implements JsonDeserializer<Eye> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Eye deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new EYE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new EYE(), Eye.class, EYE.class, fldMap);
	}

}
