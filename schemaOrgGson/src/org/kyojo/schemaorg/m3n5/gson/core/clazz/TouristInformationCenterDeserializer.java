package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.TOURIST_INFORMATION_CENTER;
import org.kyojo.schemaorg.m3n5.core.Clazz.TouristInformationCenter;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class TouristInformationCenterDeserializer implements JsonDeserializer<TouristInformationCenter> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public TouristInformationCenter deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new TOURIST_INFORMATION_CENTER(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new TOURIST_INFORMATION_CENTER(), TouristInformationCenter.class, TOURIST_INFORMATION_CENTER.class, fldMap);
	}

}
