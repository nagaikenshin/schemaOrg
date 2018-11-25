package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.PROVIDER_MOBILITY;
import org.kyojo.schemaorg.m3n4.core.Container.ProviderMobility;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class ProviderMobilityDeserializer implements JsonDeserializer<ProviderMobility> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public ProviderMobility deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new PROVIDER_MOBILITY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new PROVIDER_MOBILITY(), ProviderMobility.class, PROVIDER_MOBILITY.class, fldMap);
	}

}
