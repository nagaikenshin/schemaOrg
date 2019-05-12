package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.SIGNIFICANT_LINK;
import org.kyojo.schemaorg.m3n5.core.Container.SignificantLink;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class SignificantLinkDeserializer implements JsonDeserializer<SignificantLink> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public SignificantLink deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new SIGNIFICANT_LINK(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new SIGNIFICANT_LINK(), SignificantLink.class, SIGNIFICANT_LINK.class, fldMap);
	}

}
