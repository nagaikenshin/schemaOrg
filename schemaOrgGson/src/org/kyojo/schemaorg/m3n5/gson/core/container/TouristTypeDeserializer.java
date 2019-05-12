package org.kyojo.schemaorg.m3n5.gson.core.container;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.TOURIST_TYPE;
import org.kyojo.schemaorg.m3n5.core.Container.TouristType;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class TouristTypeDeserializer implements JsonDeserializer<TouristType> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public TouristType deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new TOURIST_TYPE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new TOURIST_TYPE(), TouristType.class, TOURIST_TYPE.class, fldMap);
	}

}
