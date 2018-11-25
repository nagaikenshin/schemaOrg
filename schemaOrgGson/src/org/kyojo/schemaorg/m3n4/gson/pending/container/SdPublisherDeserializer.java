package org.kyojo.schemaorg.m3n4.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.SD_PUBLISHER;
import org.kyojo.schemaorg.m3n4.pending.Container.SdPublisher;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class SdPublisherDeserializer implements JsonDeserializer<SdPublisher> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SdPublisher deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SD_PUBLISHER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SD_PUBLISHER(), SdPublisher.class, SD_PUBLISHER.class, fldMap);
	}

}
