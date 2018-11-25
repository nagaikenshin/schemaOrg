package org.kyojo.schemaorg.m3n4.gson.pending.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.pending.impl.UNNAMED_SOURCES_POLICY;
import org.kyojo.schemaorg.m3n4.pending.Container.UnnamedSourcesPolicy;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class UnnamedSourcesPolicyDeserializer implements JsonDeserializer<UnnamedSourcesPolicy> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public UnnamedSourcesPolicy deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new UNNAMED_SOURCES_POLICY(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new UNNAMED_SOURCES_POLICY(), UnnamedSourcesPolicy.class, UNNAMED_SOURCES_POLICY.class, fldMap);
	}

}
