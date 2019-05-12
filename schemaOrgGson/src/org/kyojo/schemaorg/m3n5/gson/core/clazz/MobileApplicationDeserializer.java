package org.kyojo.schemaorg.m3n5.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.core.impl.MOBILE_APPLICATION;
import org.kyojo.schemaorg.m3n5.core.Clazz.MobileApplication;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class MobileApplicationDeserializer implements JsonDeserializer<MobileApplication> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MobileApplication deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MOBILE_APPLICATION(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MOBILE_APPLICATION(), MobileApplication.class, MOBILE_APPLICATION.class, fldMap);
	}

}
