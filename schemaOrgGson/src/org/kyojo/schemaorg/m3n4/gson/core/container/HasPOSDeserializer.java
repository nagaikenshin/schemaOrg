package org.kyojo.schemaorg.m3n4.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.HAS_POS;
import org.kyojo.schemaorg.m3n4.core.Container.HasPOS;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class HasPOSDeserializer implements JsonDeserializer<HasPOS> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public HasPOS deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new HAS_POS(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new HAS_POS(), HasPOS.class, HAS_POS.class, fldMap);
	}

}
