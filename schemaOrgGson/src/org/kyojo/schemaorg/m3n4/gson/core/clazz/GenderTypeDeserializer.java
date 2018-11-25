package org.kyojo.schemaorg.m3n4.gson.core.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n4.core.impl.GENDER_TYPE;
import org.kyojo.schemaorg.m3n4.core.Clazz.GenderType;
import org.kyojo.schemaorg.m3n4.gson.DeserializerTemplate;

public class GenderTypeDeserializer implements JsonDeserializer<GenderType> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public GenderType deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new GENDER_TYPE(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new GENDER_TYPE(), GenderType.class, GENDER_TYPE.class, fldMap);
	}

}
