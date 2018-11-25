package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.RELATED_LINK;
import org.kyojo.schemaorg.m3n4.core.Container.RelatedLink;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class RelatedLinkDeserializer implements JsonDeserializer<RelatedLink> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public RelatedLink deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new RELATED_LINK(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new RELATED_LINK(), RelatedLink.class, RELATED_LINK.class, fldMap);
	}

}
