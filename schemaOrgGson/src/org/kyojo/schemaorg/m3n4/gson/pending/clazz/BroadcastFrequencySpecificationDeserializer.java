package org.kyojo.schemaorg.m3n4.gson.pending.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.BROADCAST_FREQUENCY_SPECIFICATION;
import org.kyojo.schemaorg.m3n4.pending.Clazz.BroadcastFrequencySpecification;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class BroadcastFrequencySpecificationDeserializer implements JsonDeserializer<BroadcastFrequencySpecification> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public BroadcastFrequencySpecification deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new BROADCAST_FREQUENCY_SPECIFICATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new BROADCAST_FREQUENCY_SPECIFICATION(), BroadcastFrequencySpecification.class, BROADCAST_FREQUENCY_SPECIFICATION.class, fldMap);
	}

}
