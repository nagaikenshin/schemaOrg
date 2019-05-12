package org.kyojo.schemaorg.m3n5.gson.healthLifesci.physicalExam;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.physicalExam.HEAD;
import org.kyojo.schemaorg.m3n5.healthLifesci.PhysicalExam.Head;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class HeadDeserializer implements JsonDeserializer<Head> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public Head deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new HEAD(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new HEAD(), Head.class, HEAD.class, fldMap);
	}

}