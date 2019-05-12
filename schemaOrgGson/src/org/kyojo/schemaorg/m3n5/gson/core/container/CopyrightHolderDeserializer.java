package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.COPYRIGHT_HOLDER;
import org.kyojo.schemaorg.m3n5.core.Container.CopyrightHolder;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class CopyrightHolderDeserializer implements JsonDeserializer<CopyrightHolder> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CopyrightHolder deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new COPYRIGHT_HOLDER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new COPYRIGHT_HOLDER(), CopyrightHolder.class, COPYRIGHT_HOLDER.class, fldMap);
	}

}
