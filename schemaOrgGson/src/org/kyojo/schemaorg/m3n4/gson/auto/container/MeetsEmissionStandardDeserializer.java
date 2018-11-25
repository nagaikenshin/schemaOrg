package org.kyojo.schemaorg.m3n4.gson.auto.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.auto.impl.MEETS_EMISSION_STANDARD;
import org.kyojo.schemaorg.m3n4.auto.Container.MeetsEmissionStandard;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class MeetsEmissionStandardDeserializer implements JsonDeserializer<MeetsEmissionStandard> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MeetsEmissionStandard deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MEETS_EMISSION_STANDARD(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MEETS_EMISSION_STANDARD(), MeetsEmissionStandard.class, MEETS_EMISSION_STANDARD.class, fldMap);
	}

}
