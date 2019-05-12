package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.ASSOCIATED_MEDIA;
import org.kyojo.schemaorg.m3n5.core.Container.AssociatedMedia;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class AssociatedMediaDeserializer implements JsonDeserializer<AssociatedMedia> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public AssociatedMedia deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ASSOCIATED_MEDIA(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ASSOCIATED_MEDIA(), AssociatedMedia.class, ASSOCIATED_MEDIA.class, fldMap);
	}

}
