package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.ELIGIBLE_DURATION;
import org.kyojo.schemaorg.m3n5.core.Container.EligibleDuration;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class EligibleDurationDeserializer implements JsonDeserializer<EligibleDuration> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public EligibleDuration deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ELIGIBLE_DURATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ELIGIBLE_DURATION(), EligibleDuration.class, ELIGIBLE_DURATION.class, fldMap);
	}

}
