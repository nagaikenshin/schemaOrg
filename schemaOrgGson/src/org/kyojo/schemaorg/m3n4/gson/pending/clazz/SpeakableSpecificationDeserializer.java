package org.kyojo.schemaorg.m3n4.gson.pending.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.SPEAKABLE_SPECIFICATION;
import org.kyojo.schemaorg.m3n4.pending.Clazz.SpeakableSpecification;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class SpeakableSpecificationDeserializer implements JsonDeserializer<SpeakableSpecification> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SpeakableSpecification deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SPEAKABLE_SPECIFICATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SPEAKABLE_SPECIFICATION(), SpeakableSpecification.class, SPEAKABLE_SPECIFICATION.class, fldMap);
	}

}
