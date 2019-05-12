package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.ISIC_V4;
import org.kyojo.schemaorg.m3n5.core.Container.IsicV4;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class IsicV4Deserializer implements JsonDeserializer<IsicV4> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public IsicV4 deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new ISIC_V4(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new ISIC_V4(), IsicV4.class, ISIC_V4.class, fldMap);
	}

}
