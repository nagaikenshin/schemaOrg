package org.kyojo.schemaorg.m3n4.gson.healthLifesci.physicalExam;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.healthLifesci.physicalExam.NECK;
import org.kyojo.schemaorg.m3n4.healthLifesci.PhysicalExam.Neck;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class NeckDeserializer implements JsonDeserializer<Neck> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Neck deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new NECK(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new NECK(), Neck.class, NECK.class, fldMap);
	}

}
